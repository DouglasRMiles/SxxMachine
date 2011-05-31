%%%  Jean Vaucher's benchmark

/* 
 CHANGELOG by M.Banbara 
   - main/0 is added.
   - not/1  --> (\+)/1
*/

main :- solve(p(2,2), _).

%  Author: Jean Vaucher
%  path.pro:  Benchmark program to evaluate light-weight 
%             Prolog interpreters for use with Java agents.... 

%  XProlog (http://www.iro.umontreal.ca/~vaucher/XProlog/)

% Depth-first search to find a path between Point1 and Point2 on 
% an 8x8 grid with walls. The top-level predicate to call is:

%     solve( Point1, Point2, Path).
% or  solve(         Point2, Path).          ...implies P1 = (1,1)

%  Try in order:
%      solve( Dest, L).
%      solve( p(8,8), L).
%      solve( p(2,2), L).   << this may take several minutes

% The program has been adapted to WProlog which has no arithmetic and
%   simplified mechanisms:  not( X ) and once( Pred ) instead of CUT
%   but is easy to change.  Note, the last test involves 84 million 
%   calls of the recursive "unify" method in WProlog.
% Some results of last test:

%   my PC:  WProlog   157 sec.
%   my PC:  XProlog    67 sec    (slightly modified WProlog)
%   my PC   JIProlog  168 sec
%   51 sec  XProlog on 1.1 GHz P3 Notebook, 368 MB Ram, JDK 1.3.1 (F.Kratzer)

% Univ server:      To compare to Sicstus, industrial Prolog (interpreted)
%   WProlog   215 sec
%   XProlog   140 sec
%   Sicstus    14 sec


solve(Dest,L) :- 
   solve(p(1,1), Dest, L).
solve(S, Dest, Sol) :-
    path(S, Dest, [S], Path),
    invert(Path, Sol).

path( P,  P,  L,  L).
path( Node, Goal, Path, Sol) :- 
    arc( Node, Node2),  \+( wall(Node2) ),
    \+( member( Node2, Path)),
    path( Node2, Goal, [Node2 | Path], Sol).

arc( p(X,Y), p(X1,Y) ) :- suc(X,X1).
arc( p(X,Y), p(X1,Y) ) :- suc(X1,X).
arc( p(X,Y), p(X,Y1) ) :- suc(Y,Y1).
arc( p(X,Y), p(X,Y1) ) :- suc(Y1,Y).

wall( p(3,2) ).
wall( p(3,3) ).
wall( p(3,4) ).
wall( p(5,3) ).
    
suc(1,2).
suc(2,3).
suc(3,4).
suc(4,5).
suc(5,6).
suc(6,7).
suc(7,8).
    
invert(IN, OUT) :- invert1(IN,[],OUT).

invert1([], L,L).
invert1( [A | Tail], L,Res) :-
    invert1( Tail, [A | L], Res).

member(X, [X|Y]).
member(X, [A|B]) :- member(X,B).
