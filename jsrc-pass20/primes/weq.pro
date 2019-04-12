

all(P,all(X,all(Y, and(P=X*Y , ~(X=1) , ~(Y =1)) => ~prime(P)))), Out))

%  nat(X):- between(0,inf,X).
%  ~nat(X):- \+ nat(X).



?- notrace(kif_to_boxlog( all(P,all(X,all(Y, and(P=X*Y , ~(X=1) , ~(Y =1)) => ~prime(P)))), Out)),maplist(dmsg,Out).

% proven_tru(X=1) :-
%     nesc(prime(P)).
%     nesc(P=X*Y),
%     falsify(Y=1).

% proven_neg(prime(P)) :-
%     nesc(P=X*Y),
%     falsify(X=1),
%     falsify(Y=1).

% proven_neg(P=X*Y) :-
%     nesc(prime(P)).
%     falsify(X=1),
%     falsify(Y=1).


  
?- notrace(kif_to_boxlog( all(M, and( nat(M) , M>1 ) => exists(Y,exists(X, and(prime(X), prime(Y)) =>  M+M=X+Y ))), Out)),maplist(dmsg,Out).

% deduce_tru(M+M=X+Y) :-
%     nesc(prime(X)),
%     nesc(prime(Y)),
%     nesc(nat(M)),
%     nesc(M>1).

% proven_neg(prime(X)) :-
%     nesc(prime(Y)),
%     nesc(nat(M)),
%     nesc(M>1),
%     falsify(M+M=X+Y).


% deduce_neg(M+M=X+Y) :-
%     skolem(M,
%            skF(1,
%                'skMNat>False=+_1_0FnSk'(Y, X),
%                M,
%                [a(nat(M))=true, o(M>1)=true, p(M+M=X+Y)=false, ...(_21563482)])).
% deduce_tru(nat(M)) :-
%     skolem(M,
%            skF(1,
%                'skMNat>False=+_1_0FnSk'(Y, X),
%                M,
%                [a(nat(M))=true, o(M>1)=true, p(M+M=X+Y)=false, ...(_21573706)])).
% deduce_tru(prime(X)) :-
%     skolem(M,
%            skF(1,
%                'skMNat>False=+_1_0FnSk'(Y, X),
%                M,
%                [a(nat(M))=true, o(M>1)=true, p(M+M=X+Y)=false, ...(_21583968)])).
% deduce_tru(M>1) :-
%     skolem(M,
%            skF(1,
%                'skMNat>False=+_1_0FnSk'(Y, X),
%                M,
%                [a(nat(M))=true, o(M>1)=true, p(M+M=X+Y)=false, ...(_21594282)])).





 ?- cls, notrace(kif_to_boxlog(all(M, and( nat(M) , M>1 ) => exists(Y,exists(X, and(prime(X), prime(Y)) =>  M+M=X+Y ))), Out)),maplist(dmsg,Out).

% kif :-
%     all(M, =>(nat(M)&(M>1), exists(Y, exists(X, =>(prime(X)&prime(Y), M+M=X+Y))))).
% maplist(call, [put_attr(Y, skv, 'skYPrimeFalse=Arg2+_1_1FnSk'(M, [_27489472, _27489478]))]),
% attr_unify_hook(skXFalsePrime_1_0FnSk(Y, M), [_27489472, _27489478]).
% nnf :-
%     maplist(call,
%
%             [ put_attr(X, skv, skXFalsePrime_1_0FnSk(Y, M)),
%               put_attr(Y, skv, 'skYPrimeFalse=Arg2+_1_1FnSk'(M, X))
%             ]),
%     v(v(~nat(M), ~ (M>1)),
%       v((prime(X)&prime(Y))& ~ (M+M=X+Y), skolem(Y, skF(1, 'skYPrimeFalse=Arg2+_1_1FnSk'(M, X), Y, [or([[q(prime(X))=true, a(prime(Y))=true], p(M+M=X+Y)=false], p(skolem(X, skF(1, skXFalsePrime_1_0FnSk(Y, M), X, [((a(prime(X))=false;q(prime(Y))=false);p(M+M=X+Y)=true)])))=true), or(or(a(prime(Y))=false, p(M+M=X+Y)=true), p(skolem(X, skF(1, skXFalsePrime_1_0FnSk(Y, M), X, [((a(prime(X))=false;q(prime(Y))=false);p(M+M=X+Y)=true)])))=false)])))&v(~skolem(Y, skF(1, 'skYPrimeFalse=Arg2+_1_1FnSk'(M, X), Y, [or([[q(prime(X))=true, a(prime(Y))=true], p(M+M=X+Y)=false], p(skolem(X, skF(1, skXFalsePrime_1_0FnSk(Y, M), X, [((a(prime(X))=false;q(prime(Y))=false);p(M+M=X+Y)=true)])))=true), or(or(a(prime(Y))=false, p(M+M=X+Y)=true), p(skolem(X, skF(1, skXFalsePrime_1_0FnSk(Y, M), X, [((a(prime(X))=false;q(prime(Y))=false);p(M+M=X+Y)=true)])))=false)])), v((prime(X)&prime(Y))& ~ (M+M=X+Y), skolem(X, skF(1, skXFalsePrime_1_0FnSk(Y, M), X, [or(or(a(prime(X))=false, q(prime(Y))=false), p(M+M=X+Y)=true)])))&v(v(v(~prime(X), ~prime(Y)), M+M=X+Y), ~skolem(X, skF(1, skXFalsePrime_1_0FnSk(Y, M), X, [or(or(a(prime(X))=false, q(prime(Y))=false), p(M+M=X+Y)=true)]))))).
% tlog_nnf_out_negated :-
%     (n(~nat(M))&n(~ (M>1)))&v(v(v(n(nesc(prime(X))), n(nesc(prime(Y)))), n(~ (M+M=X+Y)))&n(nesc(skolem(Y, skF(1, 'skYPrimeFalse=Arg2+_1_1FnSk'(M, X), Y, [v([[q(prime(X))=true, a(prime(Y))=true], p(M+M=X+Y)=false], p(skolem(X, skF(1, skXFalsePrime_1_0FnSk(Y, M), X, [v(v(a(prime(X))=false, q(prime(Y))=false), p(M+M=X+Y)=true)])))=true), v(v(a(prime(Y))=false, p(M+M=X+Y)=true), p(skolem(X, skF(1, skXFalsePrime_1_0FnSk(Y, M), X, [v(v(a(prime(X))=false, q(prime(Y))=false), p(M+M=X+Y)=true)])))=false)])))), n(~skolem(Y, skF(1, 'skYPrimeFalse=Arg2+_1_1FnSk'(M, X), Y, [v([[q(prime(X))=true, a(prime(Y))=true], p(M+M=X+Y)=false], p(skolem(X, skF(1, skXFalsePrime_1_0FnSk(Y, M), X, [v(v(a(prime(X))=false, q(prime(Y))=false), p(M+M=X+Y)=true)])))=true), v(v(a(prime(Y))=false, p(M+M=X+Y)=true), p(skolem(X, skF(1, skXFalsePrime_1_0FnSk(Y, M), X, [v(v(a(prime(X))=false, q(prime(Y))=false), p(M+M=X+Y)=true)])))=false)])))&v(v(v(n(nesc(prime(X))), n(nesc(prime(Y)))), n(~ (M+M=X+Y)))&n(nesc(skolem(X, skF(1, skXFalsePrime_1_0FnSk(Y, M), X, [v(v(a(prime(X))=false, q(prime(Y))=false), p(M+M=X+Y)=true)])))),  ((n(~prime(X))&n(~prime(Y)))&n(nesc(M+M=X+Y)))&n(~skolem(X, skF(1, skXFalsePrime_1_0FnSk(Y, M), X, [v(v(a(prime(X))=false, q(prime(Y))=false), p(M+M=X+Y)=true)]))))).
%
c_success(baseKB,baseKB:same_clauses((deduce_neg(prime(_27388362)):-nesc(prime(_27434018)),falsify(_27285840+_27285840=_27388362+_27434018),skolem(_27388362,skF(1,skXFalsePrime_1_0FnSk(_27434018,_27285840),_27388362,[((a(prime(_27388362))=false;q(prime(_27434018))=false);p(_27285840+_27285840=_27388362+_27434018)=true)])),skolem(_27434018,skF(1,'skYPrimeFalse=Arg2+_1_1FnSk'(_27285840,_27388362),_27434018,[([[q(prime(_27388362))=true,a(prime(_27434018))=true],p(_27285840+_27285840=_27388362+_27434018)=false];p(skolem(_27388362,skF(1,skXFalsePrime_1_0FnSk(_27434018,_27285840),_27388362,[((a(prime(_27388362))=false;q(prime(_27434018))=false);p(_27285840+_27285840=_27388362+_27434018)=true)])))=true),((a(prime(_27434018))=false;p(_27285840+_27285840=_27388362+_27434018)=true);p(skolem(_27388362,skF(1,skXFalsePrime_1_0FnSk(_27434018,_27285840),_27388362,[((a(prime(_27388362))=false;q(prime(_27434018))=false);p(_27285840+_27285840=_27388362+_27434018)=true)])))=false)])),nesc(nat(_27285840)),nesc(_27285840>1)),(deduce_neg(prime(_27434018)):-nesc(prime(_27388362)),falsify(_27285840+_27285840=_27388362+_27434018),skolem(_27388362,skF(1,skXFalsePrime_1_0FnSk(_27434018,_27285840),_27388362,[((a(prime(_27388362))=false;q(prime(_27434018))=false);p(_27285840+_27285840=_27388362+_27434018)=true)])),skolem(_27434018,skF(1,'skYPrimeFalse=Arg2+_1_1FnSk'(_27285840,_27388362),_27434018,[([[q(prime(_27388362))=true,a(prime(_27434018))=true],p(_27285840+_27285840=_27388362+_27434018)=false];p(skolem(_27388362,skF(1,skXFalsePrime_1_0FnSk(_27434018,_27285840),_27388362,[((a(prime(_27388362))=false;q(prime(_27434018))=false);p(_27285840+_27285840=_27388362+_27434018)=true)])))=true),((a(prime(_27434018))=false;p(_27285840+_27285840=_27388362+_27434018)=true);p(skolem(_27388362,skF(1,skXFalsePrime_1_0FnSk(_27434018,_27285840),_27388362,[((a(prime(_27388362))=false;q(prime(_27434018))=false);p(_27285840+_27285840=_27388362+_27434018)=true)])))=false)])),nesc(nat(_27285840)),nesc(_27285840>1))))

% deduce_neg(prime(X)) :-
%     nesc(prime(Y)),
%     falsify(M+M=X+Y),
%     skolem(X,
%            skF(1,
%                skXFalsePrime_1_0FnSk(Y, M),
%                X,
%                [((a(prime(X))=false;q(prime(Y))=false);p(M+M=X+Y)=true)])),
%     skolem(Y,
%            skF(1,
%                'skYPrimeFalse=Arg2+_1_1FnSk'(M, X),
%                Y,
%
%                [ ([[q(prime(X))=true, a(prime(Y))=true], p(M+M=X+Y)=false];p(skolem(X, skF(1, skXFalsePrime_1_0FnSk(Y, M), X, [((a(prime(X))=false;q(prime(Y))=false);p(M+M=X+Y)=true)])))=true),
%                  ((a(prime(Y))=false;p(M+M=X+Y)=true);p(skolem(X, skF(1, skXFalsePrime_1_0FnSk(Y, M), X, [((a(prime(X))=false;q(prime(Y))=false);p(M+M=X+Y)=true)])))=false)
%                ])),
%     nesc(nat(M)),
%     nesc(M>1).
% deduce_tru(M+M=X+Y) :-
%     nesc(prime(X)),
%     nesc(prime(Y)),
%     skolem(X,
%            skF(1,
%                skXFalsePrime_1_0FnSk(Y, M),
%                X,
%                [((a(prime(X))=false;q(prime(Y))=false);p(M+M=X+Y)=true)])),
%     skolem(Y,
%            skF(1,
%                'skYPrimeFalse=Arg2+_1_1FnSk'(M, X),
%                Y,
%
%                [ ([[q(prime(X))=true, a(prime(Y))=true], p(M+M=X+Y)=false];p(skolem(X, skF(1, skXFalsePrime_1_0FnSk(Y, M), X, [((a(prime(X))=false;q(prime(Y))=false);p(M+M=X+Y)=true)])))=true),
%                  ((a(prime(Y))=false;p(M+M=X+Y)=true);p(skolem(X, skF(1, skXFalsePrime_1_0FnSk(Y, M), X, [((a(prime(X))=false;q(prime(Y))=false);p(M+M=X+Y)=true)])))=false)
%                ])),
%     nesc(nat(M)),
%     nesc(M>1).
% make_existential(X, skF(1, skXFalsePrime_1_0FnSk(Y, M), X, [((a(prime(X))=false;q(prime(Y))=false);p(M+M=X+Y)=true)])) :-
%     (   ensure_cond(X, prime(X)),
%         never_cond(X, prime(Y))
%     ;   ensure_cond(X, M+M=X+Y)
%     ),
%     skolem(Y,
%            skF(1,
%                'skYPrimeFalse=Arg2+_1_1FnSk'(M, X),
%                Y,
%
%                [ ([[q(prime(X))=true, a(prime(Y))=true], p(M+M=X+Y)=false];p(skolem(X, skF(1, skXFalsePrime_1_0FnSk(Y, M), X, [((a(prime(X))=false;q(prime(Y))=false);p(M+M=X+Y)=true)])))=true),
%                  ((a(prime(Y))=false;p(M+M=X+Y)=true);p(skolem(X, skF(1, skXFalsePrime_1_0FnSk(Y, M), X, [((a(prime(X))=false;q(prime(Y))=false);p(M+M=X+Y)=true)])))=false)
%                ])),
%     ensure_cond(X, nat(M)),
%     ensure_cond(X, M>1).
% make_existential(Y, skF(1, 'skYPrimeFalse=Arg2+_1_1FnSk'(M, X), Y, [([[q(prime(X))=true, a(prime(Y))=true], p(M+M=X+Y)=false];p(skolem(X, skF(1, skXFalsePrime_1_0FnSk(Y, M), X, [((a(prime(X))=false;q(prime(Y))=false);p(M+M=X+Y)=true)])))=true),  ((a(prime(Y))=false;p(M+M=X+Y)=true);p(skolem(X, skF(1, skXFalsePrime_1_0FnSk(Y, M), X, [((a(prime(X))=false;q(prime(Y))=false);p(M+M=X+Y)=true)])))=false)])) :-
%     (   ensure_cond(Y, prime(X)),
%         never_cond(Y, prime(Y))
%     ;   ensure_cond(Y, M+M=X+Y)
%     ),
%     ensure_cond(Y, nat(M)),
%     ensure_cond(Y, M>1).
Out = [(deduce_neg(prime(X)):-nesc(prime(Y)), falsify(M+M=X+Y), skolem(X, skF(1, skXFalsePrime_1_0FnSk(Y, M), X, [((...;...);... = ...)])), skolem(Y, skF(1, 'skYPrimeFalse=Arg2+_1_1FnSk'(M, X), Y, [(...;...)|...])), nesc(nat(M)), nesc(M>1)),  (deduce_tru(M+M=X+Y):-nesc(prime(X)), nesc(prime(Y)), skolem(X, skF(1, skXFalsePrime_1_0FnSk(Y, M), X, [(...;...)])), skolem(Y, skF(1, 'skYPrimeFalse=Arg2+_1_1FnSk'(..., ...), Y, [...|...])), nesc(nat(...)), nesc(... > ...)),  (make_existential(X, skF(1, skXFalsePrime_1_0FnSk(Y, M), X, [((... = ...;... = ...);p(...)=true)])):-(ensure_cond(X, prime(X)), never_cond(X, prime(Y));ensure_cond(X, M+M=X+Y)), skolem(Y, skF(1, 'skYPrimeFalse=Arg2+_1_1FnSk'(M, X), Y, [(...;...)|...])), ensure_cond(X, nat(M)), ensure_cond(X, M>1)),  (make_existential(Y, skF(1, 'skYPrimeFalse=Arg2+_1_1FnSk'(M, X), Y, [([...|...];... = ...),  (...;...)])):-(ensure_cond(Y, prime(...)), never_cond(Y, prime(...));ensure_cond(Y, ... + ... = ... + ...)), ensure_cond(Y, nat(M)), ensure_cond(Y, M>1))].

baseKB: [debug]  ?-

