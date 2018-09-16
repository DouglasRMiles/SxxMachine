/*  Part of SWI-Prolog

    Author:        Jan Wielemaker
    E-mail:        J.Wielemaker@vu.nl
    WWW:           http://www.swi-prolog.org
    Copyright (c)  2002-2014, University of Amsterdam
    All rights reserved.

    Redistribution and use in source and binary forms, with or without
    modification, are permitted provided that the following conditions
    are met:

    1. Redistributions of source code must retain the above copyright
       notice, this list of conditions and the following disclaimer.

    2. Redistributions in binary form must reproduce the above copyright
       notice, this list of conditions and the following disclaimer in
       the documentation and/or other materials provided with the
       distribution.

    THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
    "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
    LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS
    FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE
    COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT,
    INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING,
    BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
    LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
    CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT
    LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN
    ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
    POSSIBILITY OF SUCH DAMAGE.
*/

:- module(xpce_httpd,
          [ http_current_server/2,      % ?:Goal, ?Port
            http_server/2               % :Goal, :Options
          ]).
:- use_module(library(pce)).
:- use_module(http_header).
:- use_module(library(debug)).
:- use_module(http_wrapper).
:- use_module(library(lists)).

:- meta_predicate
    http_server(:, ?),
    http_server(:, ?, +).

/** <module> Process HTTP requests using XPCE sockets

@deprecated This was useful when multi-threading was poorly supported.
            New code should use library(http/thread_httpd).
*/

%       @http_servers: keep track of them and avoid the servers being
%       garbage collected.

:- pce_global(@http_servers, new(chain)).

%:- debug(connection).

http_current_server(Goal, Port) :-
    object(@open_sockets),
    chain_list(@open_sockets, Sockets),
    member(Socket, Sockets),
    send(Socket, instance_of, interactive_httpd),
    get(Socket, goal, Goal),
    get(Socket, address, Port).

%!  http_server(:Goal, +Options) is det.
%
%   Start server at given or arbitrary port.

http_server(Goal, Options) :-
    select(port(Port), Options, Options1),
    !,
    http_server(Goal, Port, Options1).
http_server(_Goal, _Options) :-
    throw(error(existence_error(option, port), _)).

http_server(Goal, Port, _Options) :-
    strip_module(Goal, M, PlainGoal),
    (   var(Port)
    ->  new(X, interactive_httpd(M:PlainGoal)),
        get(X, address, Port)
    ;   new(_, interactive_httpd(M:PlainGoal, Port))
    ).

/* - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
XPCE based socket handling for   generic HTTP interface infra-structure.
This module acts as a replacement for inetd_httpd, which allows a Prolog
process to acts as an inet-driven HTTP server.

Using this module the user can easily  debug HTTP connections or provide
services while running the XPCE GUI.
- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - */

:- pce_begin_class(interactive_httpd, socket,
                   "Prolog HTTP debugger").

variable(allowed_hosts, chain*,  both, "Chain of regex with acceptable peers").
variable(goal,          prolog,  get,  "Goal to use for processing").
variable(out_stream,    prolog,  get,  "Stream for output").
variable(peer,          name,    get,  "Peer connection (host only)").
variable(request,       string*, get,  "Data for first line").
variable(data,          string*, get,  "Data for POST request").
variable(chunk_data,    string*, get,  "Collect chunked input").
variable(mode,
         {request,header,post_content_length,chunked} := request,
                                 get,  "Mode of operation").

:- pce_global(@http_end_header_regex,
              new(regex('\n\r?\n\r?'))).
:- pce_global(@http_end_line_regex,
              new(regex('\n\r?'))).
:- pce_global(@http_has_header_regex,
              new(regex('[^\n]*HTTP/'))).

initialise(S, Goal:prolog, Port:[int]) :->
    default(Port, 0, ThePort),      % anonymous
    send_super(S, initialise, ThePort),
    send(S, slot, goal, Goal),
    send(S, record_separator, @http_end_line_regex),
    send(S, input_message, message(@receiver, input, @arg1)),
    send(S, accept_message, message(@arg1, accepted)),
    send(S, listen, reuse := @on),
    send(@http_servers, append, S).

unlink(S) :->
    send(@http_servers, delete_all, S),
    send_super(S, unlink).

:- pce_group(connection).

accepted(S) :->
    "A new connection is established on this socket"::
    (   pce_catch_error(_, get(S, peer_name, tuple(Peer, _Port)))
    ->  send(S, slot, peer, Peer),
        send(S, authorise),
        debug(connection, 'New connection from ~w', [Peer]),
        pce_open(S, append, Fd),
        send(S, slot, out_stream, Fd)
    ;   debug(connection, 'Cannot get peer: closing.', []),
        free(S)
    ).

authorise(S) :->
    "See whether we will proceeed with this connection"::
    get(S, allowed_hosts, Allowed),
    (   Allowed == @nil
    ->  true
    ;   get(S, peer, Peer),
        (   get(Allowed, find,
                message(@arg1, match, Peer),
                _)
        ->  true
        ;   debug(connection, 'Refused connection from ~w', [Peer]),
            free(S),
            fail
        )
    ).

unlink(S) :->
    (   debugging(connection)
    ->  get(S, peer, Peer),
        debug(connection, 'Closed connection from ~w', [Peer])
    ;   true
    ),
    (   get(S, slot, out_stream, Fd),
        Fd \== @nil
    ->  catch(close(Fd), _, true)
    ;   true
    ),
    send_super(S, unlink).

:- pce_group(request).

/* - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
->input collects input from  the  stream   until  an  entire  request is
complete. A request consists of one of the following:

        <Request>       ::= <Action> <Path>\n
                          | <Action> <Path> HTTP/<Version>\n
                            <Header>
                            <Post Data>?
- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - */

input(S, Input:string) :->
    "Process input.  The argument is the header"::
    get(S, mode, Mode),
    (   debugging(input)
    ->  send(@pce, format, 'GOT (mode %s): "%s"\n', Mode, Input)
    ;   true
    ),
    (   Mode == request             % got first line
    ->  (   send(@http_has_header_regex, match, Input)
        ->  send(S, slot, request, Input),
            send(S, slot, mode, header),
            send(S, record_separator, @http_end_header_regex)
        ;   send(S, dispatch, Input)
        )
    ;   Mode == header
    ->  send(Input, prepend, S?request),
        send(S, slot, request, @nil),
        (   send(S, collect_post_data, Input)
        ->  true
        ;   send(S, dispatch, Input)
        )
    ;   Mode == post_content_length
    ->  send(S, slot, mode, request),
        send(S, record_separator, @http_end_line_regex),
        get(S, data, Header),
        send(Header, append, Input),
        send(Header, lock_object, @on),
        send(S, slot, data, @nil),
        send(S, dispatch, Header),
        send(Header, lock_object, @off)
    ;   Mode == chunked
    ->  get(S, chunk_data, ChunkData),
        (   get(S, record_separator, Bytes),
            integer(Bytes)
        ->  send(ChunkData, append, Input),
            send(S, record_separator, '\n')
        ;   send(Input, prepend, '0x'),
            get(Input, value, HexAtom),
            term_to_atom(Bytes, HexAtom),
            (   Bytes == 0
            ->  get(S, data, Header),
                get(ChunkData, size, ContentLength),
                send(@http_chunked_regex, search, Header),
                send(@http_chunked_regex, register_value, 0, Header,
                     string('Content-Length: %d', ContentLength)),
                send(Header, append, ChunkData),
                send(S, slot, chunk_data, @nil),
                send(S, slot, mode, request),
                send(S, record_separator, @http_end_line_regex),
                send(S, dispatch, Header)
            ;   send(S, record_separator, Bytes)
            )
        )
    ).


dispatch(S, Input:string) :->
    "Hand complete input for dispatching"::
    (   debugging(dispatch)
    ->  send(@pce, write_ln, Input)
    ;   true
    ),
    pce_open(Input, read, In),
    get(S, goal, Goal),
    get(S, out_stream, Out),
    (   catch(http_wrapper(Goal, In, Out, Close, []),
              E, wrapper_error(E))
    ->  close(In),
        (   downcase_atom(Close, 'keep-alive')
        ->  send(S, slot, mode, request), % prepare for next
            send(S, record_separator, @http_end_line_regex),
            send(S, slot, data, @nil)
        ;   free(S)
        )
    ;   close(In),                  % exception or failure
        free(S)
    ).

wrapper_error(Error) :-
    (   debugging(connection)
    ->  print_message(error, Error)
    ;   true
    ),
    fail.

:- pce_group(post).


:- pce_global(@http_content_length_regex,
              new(regex('^Content-Length:[[:blank:]]*([0-9]+)', @off))).
:- pce_global(@http_chunked_regex,
              new(regex('^Transfer-encoding:[[:blank:]]*chunked', @off))).


collect_post_data(S, Header:string) :->
    (   send(@http_content_length_regex, search, Header)
    ->  get(@http_content_length_regex, register_value, Header,
            1, int, Len),
        debug(dispatch, '[POST] Content-length: ~w~n', [Len]),
        send(S, slot, mode, post_content_length),
        send(S, slot, data, Header),
        send(S, record_separator, Len)
    ;   send(@http_chunked_regex, search, Header)
    ->  send(S, slot, mode, chunked),
        send(S, slot, chunk_data, new(string)),
        send(S, record_separator, '\n')
    ).

:- pce_end_class(interactive_httpd).

