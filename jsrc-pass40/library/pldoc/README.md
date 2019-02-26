# PlDoc --- SWI-Prolog source documentation

The pldoc module processes structured comments   in Prolog source files.
These  comments  can  be  saved   to    file.   During  development  the
documentation system can start a web-server to view the documentation of
loaded sources through your browser. The server   is defined in the file
doc_http.pl and started through doc_server/1.

During  development,  a  typical  scenario  is    to   first  start  the
documentation server and start  a   browser  at <http://localhost:4000>.
Note that by default the web-pages allow  for starting an editor only if
the connection comes from =localhost=.  See   doc_server/2  to realise a
different setup.

    :- doc_server(4000).
    :- [application].

@author  Jan Wielemaker
@license LGPL
@see	 doc_server/1, doc_server/2, doc_collect/1.
