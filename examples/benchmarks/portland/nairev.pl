/*  VAX C-Prolog Benchmark Package  */
/*  Copyright 1985 by Tektronix, Inc., and Portland State University  */

mk_list(0,[]).
mk_list(N,[N|L]) :-
	N1 is N-1, mk_list(N1,L).

rev([],[]).
rev([X|L],Rlx) :-
	rev(L,Rl), app(Rl,[X],Rlx).

app([],L,L).
app([X|L1],L2,[X|L3]) :-
	app(L1,L2,L3).
