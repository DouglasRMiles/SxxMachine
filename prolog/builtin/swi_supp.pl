
:- op(1150,  fx, (package)).
package(_).
:- package 'swi_supp'.

:- dynamic('$current_typein_module'/1).
:- dynamic('$current_source_module'/1).
:- dynamic('$current_context_module'/1).
%:- database('$current_source_module'(user)=swi_supp).
%:- database('$current_typein_module'(user)=swi_supp).
%:- database('swi_supp'='$current_context_module'(user)).
'$current_typein_module'(swi_supp).
'$current_context_module'(user).
% :- [test].



typein_module(User) :- '$current_typein_module'(UserO) -> User=UserO ; User=user.
source_module(User) :- '$current_source_module'(UserO) -> User=UserO ; User=user.
context_module(UserO) :- ('$current_context_module'(User);typein_module(User))->User=UserO.



strip_module(T,M,T):- var(T),!,context_module(M).
strip_module(M:Cl,M,Cl):- !.
strip_module(T,M,T):-context_module(M).

%member(X,[1,2,3]) *-> write(X) ; write(0).

:- op(1150,xfy,('*->')).
:- public(( *-> )/2).
((IF *-> THEN ; ELSE)) :- 
  (Succeed1 = sols(0), 
   (((call(IF),nb_setarg(1,Succeed1,some)),call(THEN));
     (Succeed1 = sols(0),call(ELSE)))).

/*
(IF *-> THEN; ELSE) :-
  '$get_current_B'(Cut),
   Succeed1 = sols(0), P = user, Mode = interpret, Depth = 0,
  ((( '$meta_call'(IF, P, Cut, Depth, Mode),nb_setarg(1,Succeed1,some)),
      '$meta_call'(THEN, P, Cut, Depth, Mode) ) ; 
      (Succeed1 = sols(0),'$meta_call'(ELSE, P, Cut, Depth, Mode))).
*/

:- public(maplist/2).
maplist(P,[H|T]) :- !,call(P,H),maplist(P,T).
maplist(_,_).
:- public(maplist/3).
maplist(P,[H1|T1],[H2|T2]) :- !,call(P,H1,H2),maplist(P,T1,T2).
maplist(_,_,_).
:- public(maplist/4).
maplist(P,[H1|T1],[H2|T2],[H3|T3]) :- !,call(P,H1,H2,H3),maplist(P,T1,T2,T3).
maplist(_,_,_,_).

:- public(call/2).
call(P,A) :- P=..[F|ARGS],append(ARGS,[A],ARGSA),G=..[F|ARGSA],call(G).
:- public(call/3).
call(P,A,B) :- P=..[F|ARGS],append(ARGS,[A,B],ARGSA),G=..[F|ARGSA],call(G).
:- public(call/4).
call(P,A,B,C) :- P=..[F|ARGS],append(ARGS,[A,B,C],ARGSA),G=..[F|ARGSA],call(G).



%:- requires('$skip_list'/3).
is_cons(C):-compound(C),C=[_|_].

%:- requires(is_list/1).
is_list(C):- \+ compound(C),!, C==[].
is_list([_|C]):- is_list(C).

%!  member(?Elem, ?List)
%
%   True if Elem is a  member   of  List.  The SWI-Prolog definition
%   differs from the classical one.  Our definition avoids unpacking
%   each list element twice and  provides   determinism  on the last
%   element.  E.g. this is deterministic:
%
%       ==
%           member(X, [One]).
%       ==
%
%   @author Gertjan van Noord

member(El, [H|T]) :-
    member_(T, El, H).

member_(_, El, El).
member_([H|T], El, _) :-
    member_(T, El, H).

%!  append(?List1, ?List2, ?List1AndList2)
%
%   List1AndList2 is the concatenation of List1 and List2

append([], L, L).
append([H|T], L, [H|R]) :-
    append(T, L, R).

%!  append(+ListOfLists, ?List)
%
%   Concatenate a list of lists.  Is  true   if  ListOfLists  is a list of
%   lists, and List is the concatenation of these lists.
%
%   @param  ListOfLists must be a list of _possibly_ partial lists
/*
append(ListOfLists, List) :-
    %must_be(list, ListOfLists),
    append_(ListOfLists, List).

append_([], []).
append_([L|Ls], As) :-
    append(L, Ws, As),
    append_(Ls, Ws).
*/
%!  flatten(+NestedList, -FlatList) is det.
%
%   Is true if FlatList is a  non-nested version of NestedList. Note
%   that empty lists are removed. In   standard Prolog, this implies
%   that the atom '[]' is removed  too.   In  SWI7, `[]` is distinct
%   from '[]'.
%
%   Ending up needing flatten/2 often   indicates, like append/3 for
%   appending two lists, a bad design. Efficient code that generates
%   lists from generated small  lists   must  use  difference lists,
%   often possible through grammar rules for optimal readability.
%
%   @see append/2

flatten(List, FlatList) :-
    flatten(List, [], FlatList0),
    !,
    FlatList = FlatList0.

flatten(Var, Tl, [Var|Tl]) :-
    var(Var),
    !.
flatten([], Tl, Tl) :- !.
flatten([Hd|Tl], Tail, List) :-
    !,
    flatten(Hd, FlatHeadTail, List),
    flatten(Tl, Tail, FlatHeadTail).
flatten(NonList, Tl, [NonList|Tl]).


printAll(G):- call(G),writeq(G),nl,fail.
printAll(_).


random(X):- X is random(0).

go(1):- freeze(X,integer(X)),X=1.
go(2):- freeze(X,integer(X)), X \= 1.0.
go(3):- not(not(freeze(X,integer(X)))), X = 1.0.
go(4):- \+ \+ freeze(X,integer(X)), X = 1.0.

go(11):- freeze(X,integer(X)),freeze(X2,integer(X2)),copy_term(X+X2,Y+Y2),printAll(frozen(Y2,O)).

go(12):- freeze(X,integer(X)),printAll(frozen(X,O)).

go(13):- freeze(X,integer(X)),copy_term(X,Y),printAll(frozen(Y,O)).

go(14):- freeze(X,integer(X)),copy_term_nat(X,Y),printAll(frozen(Y,O)).
go(15):- freeze(X,integer(X)),copy_term_att(X,Y),printAll(frozen(Y,O)).

go(16):- freeze(X,integer(X)),copy_term_att(X,Y),frozen(Y,O),frozen(X,XX).
go(17):- freeze(X,integer(X)),copy_term_nat(X,Y),frozen(Y,O),frozen(X,XX).

go(18):- random(X),write(X),nl,fail.

go(19):- peek_pending(X).

go(20):- freeze(X,integer(X)),freeze(X2,integer(X2)),copy_term(X+X2,Y,Z).

go(21):- freeze(X,integer(X)),freeze(X2,integer(X2)),copy_term(X+X2,Y,Z).


%:- listing(go/1).


%lists:member(X,L):- user:member(X,L).

%:-  listing(lists:_).

