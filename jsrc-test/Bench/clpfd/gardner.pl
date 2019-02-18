/*-------------------------------------------------------------------------*/
/* Benchmark (Finite Domain)                                               */
/*                                                                         */
/* Name           : gardner.pl                                             */
/* Title          : Gardner's prime puzzle problem                         */
/* Original Source: Daniel Diaz - INRIA France                             */
/* Adapted by     : Daniel Diaz for GNU Prolog                             */
/* Date           : February 1997                                          */
/*                                                                         */
/* Solve the operation:                                                    */
/*                                                                         */
/*        mP       where tP is a string of t prime digits (2,3,5 or 7)     */
/*   x    nP                                                               */
/*   --------                                                              */
/*   = (m+n)P                                                              */
/*                                                                         */
/* Solution:                                                               */
/*                                                                         */
/* M=1 N=1                                                                 */
/*     [5,5,25]                                                            */
/*     [5,7,35]                                                            */
/*     [7,5,35]                                                            */
/*                                                                         */
/* M=4 N=3                                                                 */
/*     [3235,735,2377725]                                                  */
/*     [3323,775,2575325]                                                  */
/*     [3535,773,2732555]                                                  */
/*     [3553,775,2753575]                                                  */
/*     [3555,725,2577375]                                                  */
/*     [3575,777,2777775]                                                  */
/*     [3735,733,2737755]                                                  */
/*     [3755,725,2722375]                                                  */
/*     [5225,527,2753575]                                                  */
/*     [7225,727,5252575]                                                  */
/*     [7253,325,2357225]                                                  */
/*     [7255,355,2575525]                                                  */
/*     [7273,375,2727375]                                                  */
/*     [7275,733,5332575]                                                  */
/*     [7325,373,2732225]                                                  */
/*     [7325,727,5325275]                                                  */
/*     [7335,753,5523255]                                                  */
/*     [7353,375,2757375]                                                  */
/*     [7355,725,5332375]                                                  */
/*     [7375,753,5553375]                                                  */
/*     [7533,335,2523555]                                                  */
/*     [7575,337,2552775]                                                  */
/*     [7735,333,2575755]                                                  */
/*     [7757,355,2753735]                                                  */
/*     [7777,325,2527525]                                                  */
/*-------------------------------------------------------------------------*/

go:-
   is_top(4,5).

q:-    
	write('M ?'), read(M),
	write('N ?'), read(N),
        is_top(M,N).

is_top(M,N):-
        statistics(runtime,_),
        (gardner(M,N,L,Lab),
         write(L), nl, 
         fail
           ;
         true),
        statistics(runtime,[_,Y]),
        write('time : '), write(Y), nl.



gardner(M,N,L,Lab):-
	MN is M+N,
	length(LX,M),
	length(LY,N),
	length(LZ,MN),
	prim(LX),
	prim(LY),
	prim(LZ),
	nb(LX,X),
	nb(LY,Y),
	nb(LZ,Z),
	X*Y #= Z,
	L=[X,Y,Z],
	append(LX,LY,LXY),
	append(LXY,LZ,LXYZ),
        labeling(LXYZ).


prim([]).
prim([X|L]):-
	X in [2,3,5,7],
	prim(L).

nb(LX,X):-
	nb(LX,1,_,X).

nb([],I,I,0).
nb([X|L],I,I2,N):-
	nb(L,I,I1,N1),
	I2 is I1*10,
	I1*X+N1 #= N.





