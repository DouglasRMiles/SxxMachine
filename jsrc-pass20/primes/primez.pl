/*

 Test Queries:


?- time(prime_facter(1361129467683753853853498429727072845823, L)).
% 42,132,024 inferences, 2.654 CPU in 2.703 seconds (98% CPU, 15877312 Lips)
L = [1, 145295143558111, 7623851, 409891, 8191, 2731, 131, 31, 11|...].

?- product(X,Y,1361129467683753853853498429727072845823).
X = 1,
Y = 1361129467683753853853498429727072845823 ;
X = 3,
Y = 453709822561251284617832809909024281941 ;
X = 33,
Y = 41246347505568298601621164537184025631 ;
X = 1023,
Y = 1330527338889299954891005307651097601 ;
X = 134013,
Y = 10156697243429770648022941279779371 ;
X = 365989503,
Y = 3719039635089626747719861325441 ;
X = 2997820019073,
Y = 454039755230085062595514751 ;
X = 1228779445437851043,
Y = 1107708525510648105461 ;
X = 9368031403880806112026593,
Y = 145295143558111 ;
X = 1361129467683753853853498429727072845823,
Y = 1 ;

?- product(A,B,1).

?- product(A,B,2).

?- product(A,B,3).

?- product(A,B,9).

?- product(1,2,1).
                                                 
?- \+ product(1,2,1361129467683753853853498429727072845823).


?- time(prime_facter(4987562349672390876389027, L)).

*/

% Prime factorization

prime_facter(N, [1|L]) :-
  SN is sqrt(N),
  prime_facter_1(N, SN, 2, [], L).
 
prime_facter_1(1, _, _, L, L) :- !.
prime_facter_1(N, SN, D, L, LF) :- % Special case for 2, increment 1
  (   0 is N mod D ->
      Q is N / D,
      SQ is sqrt(Q),
      prime_facter_1(Q, SQ, D, [D |L], LF)
  ;
      D1 is D+1,
      (	D1 > SN ->
          LF = [N |L]
      ;
          prime_facter_2(N, SN, D1, L, LF)
      )
  ).
 
prime_facter_2(1, _, _, L, L) :- !. % General case, increment 2
prime_facter_2(N, SN, D, L, LF) :-
   (   0 is N mod D ->
    ( Q is N / D,
      SQ is sqrt(Q),
      prime_facter_2(Q, SQ, D, [D |L], LF))
    ;
      ((nxt_prime(D,D1)->true;D1 is D+2),
      (	D1 > SN -> 
         LF = [N |L] ; prime_facter_2(N, SN, D1, L, LF)))
   ).

% A slightly nicer version is one which is able to enumerate all the primes. 
prime(Prime) :-     
    sieve3(1, [], Prime).  

sieve3(M, PS, Prime) :- 
    N is 1+M, 
    (   member(P, PS), N mod P =:= 0 ->  % N is composite 
        sieve3(N, PS, Prime) 
    ;/* forall P in PS N mod P =\= 0 */ 
        (   Prime = N 
        ;   sieve3(N, [N|PS], Prime) 
        ) 
    ). 
            
:- dynamic(nxt_prime/2).

nxt_prime(0,1).

save_primes:- 
  prime(Prime),
  (nxt_prime(_,Prev) -> asserta(nxt_prime(Prev,Prime))),
  Prime>20000,!.


distinct_var(Var) :-
    nonvar(Var), !.
distinct_var(Var) :-
    empty_nb_set(Set),
    put_attr(Var, dist_var, Set).

dist_var:attr_unify_hook(Set, Value) :-
    add_nb_set(Value, Set, true).


:- time(save_primes).


product(A,B,C):- harness(mult,[A,B,C]).

%mult_u_u_u(A,B,C):-  guessed.
mult_u_u_b(A,B,C):- prime_facter(C,PS), distinct_var(S), distinct_var(A), some_of(PS,Some), mult_list(Some,S), member(S,[A,B]), product(A,B,C).
%mult_u_b_u(A,B,C):-  guessed.
mult_u_b_b(A,B,C):- A is C / B.
%mult_b_u_u(A,B,C):-  guessed.
mult_b_u_b(A,B,C):- mult_u_b_b(B,A,C).
mult_b_b_u(A,B,C):- C is A * B.
mult_b_b_b(A,B,C):- mult_b_b_u(A,B,C).

some_of(Pm,These):- 
  msort(Pm,PS),  
  permutation(PS,PM),
  append([Of|Some],_,PM),
  msort([Of|Some],These).

mult_list([H|T],R):- !,
  mult_list(T,NT),
  R is H*NT.
mult_list(_,1).  


% boundedness

harness(P,V):- harness(P,V,V).

to_bounds_l([],[]).
to_bounds_l([Var|Rest],[Type|RestL]):-
  to_bounds(Var,Type),
  to_bounds_l(Rest,RestL).

to_bounds(Var,Type):- var(Var), 
 % \+ attvar(Var), 
 !, Type=u.
to_bounds(_,b):-!.

harness(P,V,VT):- 
  to_bounds_l(VT,UBU),
  atomic_list_concat([P|UBU],'_',PU),
  current_predicate(PU/_),
    !,apply(PU,V).
harness(P,V,_):- atomic_list_concat([P,'g'],'_',PU),
  current_predicate(PU/_),
    !,apply(PU,V).
harness(P,V,_):- term_variables(V,Vs),
   Vs\==[],
   hook_vs(Vs,P,V).

hook_vs([],_,_).
hook_vs([V|Vs],P,V):-
  freeze(V,harness(P,V)),
  hook_vs(Vs,P,V).

