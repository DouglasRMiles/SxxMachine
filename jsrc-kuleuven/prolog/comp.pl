%% TODO: 
%
%	chr runtime stuff,
%

%Append zit standaard in JProlog
%append([],L,L) .
%append([X|L1],L2,[X|L3]) :- append(L1,L2,L3) .
%name_nil_ok(Name,Codes):- Name==[],!,Codes=`[]`.
%name_nil_ok(Name,Codes):- Codes=`[]`,!,Name==[].
name_nil_ok(Name,Codes):-atom_codes(Name,Codes),!.

changeIllegalTerms(A, A) :- var(A), !.
changeIllegalTerms(varnr, tvarnr____term) :- !.
changeIllegalTerms(cut, tcut____term) :- !.
changeIllegalTerms(continuation, tcontinuation____term) :- !.
changeIllegalTerms(A, Z) :-
   not(var(A)),
   name_nil_ok(t, [T]),
   name_nil_ok(A, [T|R]),
   name_nil_ok(Z, [T,T|R]), !.
changeIllegalTerms(A, Z) :-
   not(var(Z)),
   name_nil_ok(Z, [T,T|R]),
   name_nil_ok(t, [T]),
   name_nil_ok(A, [T|R]),
   !.
changeIllegalTerms(A, A).

changeChar('"', '\\"') :- !.
changeChar('\\', '\\\\') :- !.
changeChar(A, A).
escapeFunctor([], []) :- !.
escapeFunctor([A|FRes], [B|EFRes]) :- !,
   changeChar(A, B),
   escapeFunctor(FRes,EFRes).
escapeFunctor(A, Res) :-
  name_nil_ok(A, TmpChars), !,
  escapeChars(TmpChars, TRes),
  name_nil_ok(Res, TRes).
escapeFunctor(A, A).

%Inkomende chars zijn in int-variant, outgaande is lijst van chars
escapeChars(In, Out) :- escapeChars2(In, [], Out).
escapeChars2([], A, A) :- !.
escapeChars2([C|CR], Done, Cout) :-
  name_nil_ok(SC, [C]),  %C is int-var --> SC 1 enkel char
  changeChar(SC, SCRes),  %Escape SC --> SCRes is aangepaste versie
  name_nil_ok(SCRes, SCC), 
  append(Done, SCC, NDone),      %SCRes terug naar int en toevoegen aan lijst
  escapeChars2(CR, NDone, Cout).
  
fixBody([], []).
fixBody((B, BR), (NB,NBR)) :-
  !,
  fixClauses(B, NB),
  fixBody(BR, NBR).
fixBody(B, NB) :-
  fixClauses(B, NB).

fixNotVar(Clause, NClause) :-
   Clause = (Head :- Body), not(var(Head)), !,
   Head =.. [CName|Args],
   changeIllegalTerms(CName, NCName),
   fixClauses(Args, NArgs),
   NHead =.. [NCName | NArgs],
   fixBody(Body, NBody),
   NClause = (NHead :- NBody).
fixNotVar(Head, NHead) :-
   not(var(Head)),
   Head =.. [CName|Args],
   changeIllegalTerms(CName, NCName),
   fixClauses(Args, NArgs),
   NHead =.. [NCName | NArgs].
fixNotVar(Head, NHead) :-
   NHead =.. [NCName | NArgs],
   fixClauses(Args, NArgs),
   changeIllegalTerms(CName, NCName),
   Head =.. [CName|Args].
   
fixClauses(Clause, Clause) :- var(Clause), !.
fixClauses([], []) :- !.
fixClauses([I|IR], [O|OR]) :-
  !,
  fixClauses((I), (O)),
  fixClauses(IR, OR).
fixClauses(Clause, NClause) :- 
   not(var(Clause)), !,
   fixNotVar(Clause, NClause).
fixClauses(Clause, NClause) :- 
   not(var(NClause)), !,
   fixNotVar(Clause, NClause).
fixClauses(Clause, Clause).

comp(File) :-
	comp(File,'be.kuleuven.jProlog').

comp(File,Package) :-
	comp(File,Package,'NewModule').

%b_setval(package,Package),
%b_setval(module,Module),

comp(File,Package,Module) :-
  b_setval(package,Package),
  b_setval(module,Module),
  see(File) ,
  doCompile('.', _).

compstream(Stream, TargetFolder) :-
  useInputStream(input, Stream),
  doCompile(TargetFolder, _).

compstreamModule(Stream, TargetFolder, Package, Module) :-
   b_setval(package,Package),
   b_setval(module,Module),
   useInputStream(input, Stream),
   doCompiler(TargetFolder, Prog),
   genmodule(Prog).

doCompile(TargetFolder, Prog) :-
        use_module('be.kuleuven.jProlog.builtins.BuiltinsModule'),
        use_module('globalvars.GlobalVarsModule'),
        b_setval(targetfolder, TargetFolder),
	readprogram(Clauses),
	seen,
	eliminate_disjuctions_in_clauses(Clauses,NClauses),
	fixClauses(Clauses, FixedClauses),
	InProg = [],
    
	binarize_clauses(FixedClauses,InProg,Prog),
	genjava(Prog).

%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%% 
genjava([]) .
genjava([Pred|Preds]) :- genjavaforpred(Pred) , genjava(Preds) .

%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%% 
processfile(end_of_file, []) :- !.
processfile(Clause, [Clause|NOut]) :-
    readprogram(NOut).

readprogram(Out) :-
		read(Clause) ,
		processfile(Clause, Out).

%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%% 
% Turn bodies into binary bodies...

binarize_clauses([],Prog,Prog).
binarize_clauses([C|Cs],Prog,NProg) :-
	binarize(C,BinC),
	addclausetoprogram(BinC,Prog,Prog1),
	binarize_clauses(Cs,Prog1,NProg).

% binarize((Head ::- Body),Cl) :- ! , Cl = (Head :- Body) .
binarize((Head :- Body),(BinHead :- BinBody)) :- ! ,
			add_continuation(Head,Continuation,BinHead) ,
			makebinbody(Body,Continuation,BinBody) .
binarize(Head,(BinHead :- call(Continuation))) :-
			add_continuation(Head,Continuation,BinHead) .

binBodyGoal(Goal, NewBody0, _) :-
  nonvar(NewBody0),
  NewBody0 = call(NewBody),
  !.
binBodyGoal(Goal, NewBody0, NewGoal) :-
  makebinbody(Goal, NewBody0, NewGoal).

makebinbody(true,Continuation,NewGoal) :- nonvar(Continuation), !, NewGoal = Continuation.
makebinbody(true,Continuation,NewGoal) :- !, NewGoal = call(Continuation).
makebinbody((Goal,Body),Continuation,NewGoal) :- %Door bovenste 2 samen te nemen,
   !,                                            %gaat er minder werk verloren bij het backtracken als niet het eerste
   makebinbody(Body, Continuation, NewBody0),    %maar wel het 2de lukt
   binBodyGoal(Goal, NewBody0, NewGoal).

makebinbody(G,Continuation,NewBody) :- ! ,
			add_continuation(G,Continuation,NewBody) .

% add continuation to goal 
add_continuation('!',C,FB) :- ! , FB = cut(1,C).
add_continuation(S,C,NG) :- operator_goal(S,NS) , ! , doAdd(NS,C,NG).
add_continuation(F,C,FB) :- doAdd(F,C,FB).

doAdd(F,C,FB) :- F =.. [N|A] , append(A,[C],NA) , FB =.. [N|NA] .

%operator_goal(X, _) :- atomic(X), !, fail. %Opzoekingen in operator_goal versnellen door dingen die al geheel niet kunnen eruit te halen
% Map operator onto non-operator name
% the following are also in someprolog at the moment
operator_goal(X < Y , smallerthan(X,Y)) :- ! .
operator_goal(X =< Y , smallerorequal(X,Y)) :- ! .
operator_goal(X > Y , smallerthan(Y,X)) :- ! .
operator_goal(X >= Y , smallerorequal(Y,X)) :- ! .
operator_goal(X =:= Y , arithequal(Y,X)) :- ! .
operator_goal(X = Y , unify(Y,X)) :- ! .
operator_goal((X;Y) , or(X,Y)) :- ! .
operator_goal(X @< Y , termsmallerthan(X,Y)) :- ! .
operator_goal(X @> Y , termgreaterthan(X,Y)) :- ! .
operator_goal(X @=< Y , termsmallerequal(X,Y)) :- ! .
operator_goal(X @>= Y , termgreaterequal(X,Y)) :- ! .
operator_goal(X == Y , termequal(X,Y)) :- ! .
operator_goal(->(X, Y) , if(X,Y)) :- ! .
operator_goal(\+(X) , not(X)) :- ! .
operator_goal(T =.. [F|Args], univ(T,F,Args)) :- !.
% temporary
operator_goal(X is Y + 1,inc(X,Y)) :- !.
% CHR specific rules:
operator_goal(nb_getval(A,B),b_getval(A,B)) :- !.
operator_goal(nb_setval(A,B),b_setval(A,B)) :- !.
operator_goal(get_attr(A,_,C),get_attr(A,C)) :- !.
operator_goal(put_attr(A,_,C),put_attr(A,C)) :- !.
operator_goal(del_attr(A,_),del_attr(A)) :- !.
operator_goal(hprolog:get_ds(A,B,_),chr_get_history(A,B)) :- !.
operator_goal(hprolog:put_ds(A,B,_,C),chr_put_history(A,B,C)) :- !.
operator_goal('chr newvia'(A,B),chr_newvia(A,B)) :- !.
operator_goal('chr newvia_1'(A,B),chr_newvia_1(A,B)) :- !.
operator_goal('chr newvia_2'(A,B,C),chr_newvia_2(A,B,C)) :- !.
operator_goal('chr not_locked'(A),chr_not_locked(A)) :- !.
operator_goal('chr none_locked'(A),chr_none_locked(A)) :- !.
operator_goal('chr gen_id'(A),chr_gen_id(A)) :- !.
operator_goal('chr sbag_member'(A,B),chr_sbag_member(A,B)) :- !.
operator_goal('chr sbag_del_element'(A,B,C),chr_sbag_del_element(A,B,C)) :- !.

%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%% 
addclausetoprogram(Cl,[],[[Cl]]) :- !.
addclausetoprogram(Cl,[Pred|Rest],[[Cl|Pred]|Rest]) :-
			samepred(Cl,Pred) , !.
addclausetoprogram(Cl,[Pred|Rest],[Pred|NewRest]) :-
			addclausetoprogram(Cl,Rest,NewRest) .


samepred((H1 :- _),[(H2 :- _)|_]) :- functor(H1,N,A) , functor(H2,N,A) .

makename([],'') :- !.
makename(Atom, Atom) :- atomic(Atom) , !.
makename([AC|Rest],OutC) :-
		makename(Rest,OC),
		name_nil_ok(OC,OL),
		name_nil_ok(AC,AL),
		append(AL,OL,OutL),
		name_nil_ok(OutC,OutL).

writel([]).
writel([X|R]) :- wr(X) , writel(R).

getPackageName(Package) :-
  nb_current(package,Package), !.
getPackageName('be.kuleuven.jProlog').

wr(wr(package)) :-  
			  getPackageName(''), !.
wr(wr(package)) :- !,
            getPackageName(Package),
			write('package '),
			write(Package),
			write(';'),
			nl.
wr(wr(nl)) :- ! , nl .
wr(Atom) :- atomic(Atom) , ! , write(Atom) .
wr(varnr(A,B)) :- !, write(varnr(A,B)).
wr([]) :- !.
wr([A|R]) :- writel([A|R]).
wr(Goal) :- call(Goal) .

processKomma(Komma) :-
  var(Komma), !, Komma = yes.
processKomma(Komma) :-
  write(',').
wrargs(N,T) :- wrargs(N,T,_) .

wrargs(N,_,_) :- N = 0 , ! .
wrargs(N,T,Komma) :- 
		processKomma(Komma),
		writel([T,a,N]) ,
		M is N - 1 , 
		wrargs(M,T,Komma) .
% Pred is a list of clauses for a specific predicate
% it is binarized and also in reverse order

escapeStrings([], []).
escapeStrings([I|R], [O|RO]) :-
  escapeFunctor(I, O),
  escapeStrings(R, RO).
  
createSet(F, Goal, Set) :-
  findall(F, Goal, List),
  list_to_set(List, Set).

list_to_set(List, Set) :-
   list_to_set(List, Set, []).
   
list_to_set([], Set, Set).
list_to_set([A|R], S, Done) :-
  memberchk_eq(A, Done), !,
  list_to_set(R, S, Done).
list_to_set([A|R], S, Done) :-
  append(Done, [A], DR),
  list_to_set(R, S, DR).
  
getPredHeader(Pred, Head, Body) :-
   Pred = (Head :- Body), !.
getPredHeader(Head, Head, []).   

toJavaClassName('?-', 1, query).
toJavaClassName(N, AA, ClassName) :-
	makename([pred_,N,'_',AA],ClassName).

getData(Pred, Conts, Strings, AllInts) :-
  createSet(F,continuationof(Pred,F),Conts) ,
  createSet(F,stringof(Pred,F),AllStrings) ,
  createSet(F,intof(Pred,F),AllInts),
  %Strings komen uit fixed code, Strings mogen terug naar normaal
  fixClauses(DeFixed, AllStrings),
  escapeStrings(DeFixed, AllEscapedStrings),
  Strings = ['cut'|AllEscapedStrings].

genFileName(ClassName, FileName) :-
   b_getval(targetfolder, TargetFolder),
   makename([TargetFolder, '/', ClassName,'.java'],FileName).

log(A) :- 
  nb_current('VERBOSE',true), !,
  writel(A), nl.
log(_).

:- nb_setval('DISABLE_INDEXING',false).

disableIndexing(ClassName) :- concat_atom(['DISABLE_INDEXING_', ClassName], FullName), b_setval(FullName, true), log(['DISABLE INDEXING ENABLED for ',ClassName]).

isIndexingAllowed(_) :- nb_current('DISABLE_INDEXING', true), !, fail.
isIndexingAllowed(ClassName) :- concat_atom(['DISABLE_INDEXING_', ClassName], FullName), nb_current(FullName, true), !, fail.
isIndexingAllowed(_).

printImport(Import) :-
  getPackageName(Import), !.
printImport(Import) :-
  writel(['import ',Import,'.*;',wr(nl)]).

printHeading :-
  writel([wr(package),
          printImport('be.kuleuven.jProlog'),
          printImport('java.util')]).

printDataClass(ClassName, Conts, N, A, Strings, AllInts) :-
   writel(['class ',ClassName,'_consts {',wr(nl),
           '   Code entry_code;',wr(nl),
	   declforeachcontinuation(Conts,N,A),
	   declforeachstring(Strings,0),
	   declforeachint(AllInts),
           '}',
           wr(nl)]).

printMainConstruction(ClassName) :-
  writel(['private final ',ClassName,'_consts consts;',
          wr(nl),
          'public ',ClassName,'(){',wr(nl),
          '  consts = new ',ClassName,'_consts();',wr(nl),
          '  initAlternatives();',wr(nl),
          '}',wr(nl),
          'protected ',ClassName,'(',ClassName,' c){',wr(nl),
          '  consts = c.getConsts();',wr(nl),
          '  ALT = null;',wr(nl),
          '}',wr(nl),
          'protected final ',ClassName,'_consts getConsts() { return consts; }',wr(nl)]).

maxClauses([], _).
maxClauses([_|_], 0) :- !, fail.
maxClauses([_|R], N) :-
  N1 is N - 1,
  maxClauses(R, N1).

isToSmall(_, 0).
isToSmall(Pred, _) :-
  maxClauses(Pred, 5).

shouldDisableIndexing(ClassName, PredName, Arity, Pred) :- 
  isIndexingAllowed(ClassName),
  isToSmall(Pred, Arity),
  disableIndexing(ClassName), !.

shouldDisableIndexing(_, _, _, _).

printMainExec([Clause], Arity, Strings) :-
  !,
  getPredHeader(Clause, Head, Body),
  functor(Head,Name,Arity),
  arg(Arity,Head,continuation(Arity)) ,
  NClause = Clause,
  getPredHeader(NClause, NHead, NBody),      
  mynumbervars(NClause,1,NumbVars), 
  printPredExecCode(Arity, NumbVars, NHead, NBody, Strings, Clause, Name).

printMainExec(_, Arity, _) :-
	writel(['     PrologObject aregs[] = mach.createAregCopy(',
		Arity,
		');',
		wr(nl),
		'     mach.createChoicePoint(aregs) ;',
		wr(nl),
                '     Iterator<Code> todo = ALT.getIndexedAlternatives(aregs);',
                wr(nl),
                '     mach.fillAlternatives(todo);',wr(nl),
		'     return todo.next().exec(mach);',wr(nl)]).

genjavaforpred(Pred) :-
	    Pred = [PredItem|_] ,
            getPredHeader(PredItem, H, _),
	    functor(H,Name,A) , AA is A - 1,
            changeIllegalTerms(N, Name),
            toJavaClassName(N, AA, ClassName),
            genFileName(ClassName, FileName),
            getData(Pred, Conts, Strings, AllInts),
            !,
            shouldDisableIndexing(ClassName, Name, AA, Pred),
	    tell(FileName) ,
	    prelude , !,
            printHeading,
	    writel([printDataClass(ClassName, Conts, N, A, Strings, AllInts),
				'public class ',
				ClassName,
				' extends Code {',
				wr(nl),
                                printMainConstruction(ClassName),
				declforeachclause(Pred,1,ClassName),wr(nl),
				'  public void init(PredikatenPrologMachine mach) {',
				wr(nl),
				'    consts.entry_code = this;',
				wr(nl),
				initforeachcontinuation(Conts,N,A) ,
				'}',
				wr(nl),
				'  @Override public int arity() { return ',
				AA,
				' ; }',
				wr(nl),
				'  @Override',wr(nl), 
                                '  @SuppressWarnings("static-access")',wr(nl),
                                '  public Code exec(PrologMachine mach) {', wr(nl),
				printMainExec(Pred, A, Strings),
				wr(nl),
				'}',
				wr(nl),
				'}',
				wr(nl) , wr(nl)
				]) ,
                        checkClauses(Pred, ClassName, Strings),
			told, !.

mysetof(X,Y,Z) :- setof(X,Y,Z) , ! .
mysetof(_,_,[]) .

checkClauses([_], _, _) :- !.
checkClauses(Pred, ClassName, Strings) :-
	genpredcode(Pred,last,ClassName,_,Strings).

genpredcode([],_,_,0,_) .
genpredcode([Clause|Rest],Last,ClassName,M,Strings) :-
			genpredcode(Rest,notlast,ClassName,N,Strings) ,
			M is N + 1 ,
			genclausecode(Clause,Last,ClassName,M,Strings) .

%setChoicepoint(last, _, _) :-
%        !,
%        write('mach.removeChoice();').
%setChoicepoint(Last, M, N) :-
%        M is N + 1,
%		writel(['mach.fillAlternative(cl',
%					M,') ;'
%					]).
                    
doNumberVars(NumbVars) :-
        NumbVars > 1, !,
        declvars(NumbVars).
doNumberVars(_).

createDummyVars(1) :- ! .
createDummyVars(N) :- M is N - 1 ,
		writel(['    @SuppressWarnings("unused")',wr(nl),
                        '    PrologObject var',M,' = new DummyVar();',wr(nl)]) ,
		createDummyVars(M).

createArgs(Head,Strings) :- Head =.. [_|Args] , createArgs(Args,0,Strings).

createArgs([_],_,_) :- ! . % this is the continuation !
createArgs([Arg|Args],N,Strings) :-
		M is N + 1 , 
		writel(['    PrologObject arg', N,' = ', constructterm(Arg,Strings), ';',wr(nl)]),
                createArgs(Args,M,Strings).

bundleArgs(N, N) :- !.
bundleArgs(S, _) :-
  S > 0,
  writel([', ']),
  fail.
bundleArgs(S, N) :-
  NS is S + 1,
  writel(['arg', S]),
  bundleArgs(NS, N).

bundleArgs(N) :-
  writel(['    return new PrologObject[]{', bundleArgs(0, N), '};']).

printMethodForIndexing(NumbVars, NHead, Strings, Amin1) :-
  writel(['  @Override',wr(nl),
          '  @SuppressWarnings("static-access")',wr(nl),
          '  protected PrologObject[] getArgs() {', wr(nl),
          createDummyVars(NumbVars),
          createArgs(NHead, Strings),
          bundleArgs(Amin1), wr(nl),
          '  }', wr(nl)]).

printClauseConstructor(ClassName, N) :-
  writel([ClassName,'_',N,'(',ClassName,' consts){',wr(nl),
          '  super(consts);',wr(nl),
          '}',wr(nl),wr(nl)]).

printPredExecCode(Arity, NumbVars, NHead, NBody, Strings, Clause, Name) :-
        Amin2 is Arity - 2,
        Amin1 is Arity - 1,
	writel(['    PrologObject local_aregs[] = mach.getAreg();', wr(nl),
		'    PrologObject continuation = local_aregs[',Amin1,'] ;', wr(nl) ,
		decl_deref_args(Amin2),			
		doNumberVars(NumbVars),
		gets(NHead,Strings) ,
		puts(NBody,Strings) ,
		'    mach.updateCUTB();',wr(nl),
		nullifyaregs(Clause) ,
		'    return ',
		bodycont(Clause,Name,Arity) ,
		';',
		wr(nl)]).

printPredExec(Arity, NumbVars, NHead, NBody, Strings, Clause, Name) :-
	writel(['  @Override',wr(nl),
                '  @SuppressWarnings("static-access")',wr(nl),
                '  public Code exec(PrologMachine mach) {',wr(nl),
		%setChoicepoint(Last, M, N),
		printPredExecCode(Arity, NumbVars, NHead, NBody, Strings, Clause, Name),
		'  }',wr(nl)]).

genclausecode(Clause,Last,ClassName,N,Strings) :-
        getPredHeader(Clause, Head, Body),
	functor(Head,Name,Arity) ,
	Amin1 is Arity - 1,
	arg(Arity,Head,continuation(Arity)) ,
        NClause = Clause,
        getPredHeader(NClause, NHead, NBody),      
        mynumbervars(NClause,1,NumbVars), 
	writel(['class ',ClassName,'_',N,' extends ',ClassName,' {',wr(nl),
			 printClauseConstructor(ClassName, N),
			 printMethodForIndexing(NumbVars, NHead, Strings, Amin1),
                         printPredExec(Arity, NumbVars, NHead, NBody, Strings, Clause, Name),
			'}',wr(nl), wr(nl)
			]), ! .

nullifyaregs((H :- B)) :-
		functor(H,_,HA) , functor(B,_,BA) , Diff is HA - BA ,
		Diff > 0 ,
		nullify(Diff,HA) .
nullifyaregs(_) .

nullify(0,_) :- ! , write('null ;') , nl , fail .
nullify(N,K) :-	L is K - 1 ,
		writel(['local_aregs[',L,'] = ']) ,
		M is N - 1 ,
		nullify(M,L) .

mynumbervars(Var,I,O) :- var(Var) , ! , Var = varnr(I,_) , O is I + 1 .
mynumbervars(varnr(A,B), I,O) :- ! , I = O .
mynumbervars(A,I,O) :- atomic(A) , ! , I = O .
mynumbervars(Term,I,O) :- Term =.. [_|Args] , mynumbervarslist(Args,I,O) .

mynumbervarslist([],I,I) .
mynumbervarslist([T|R],I,O) :- mynumbervars(T,I,II) , mynumbervarslist(R,II,O) .


gets(Head,Strings) :- Head =.. [_|Args] , gets(Args,0,Strings) .

gets([_],_,_) :- ! . % this is the continuation !
gets([Arg|Args],N,Strings) :-
		M is N + 1 , getforarg(Arg,N,Strings) , gets(Args,M,Strings) .

getforarg(Arg,N,Strings) :-
		writel(['    if (!(areg',N,'.unify(',constructterm(Arg,Strings),
			'))) return mach.Fail0 ;',wr(nl)]) .


puts(cut(_,C),Strings) :- ! ,
		writel(['    mach.doCut(mach.getCUTB())  ;',wr(nl)]) ,
		putforarg(C,0,Strings) .
puts(Body,Strings) :- Body =.. [_|Args] , puts(Args,0,Strings) .

puts([],_,_) .
puts([Arg|Args],N,Strings) :-
		M is N + 1 , putforarg(Arg,N,Strings) , puts(Args,M,Strings) .

putforarg(Arg,N,Strings) :-
	writel(['local_aregs[',N,'] = ',constructterm(Arg,Strings),' ;',wr(nl)]) .

declvars(1) :- ! .
declvars(N) :- M is N - 1 ,
		writel(['PrologObject var',M,' = new Var(mach) ;',wr(nl)]) ,
		declvars(M) .

% variables are replaced with varnr(integer,_)
% continuation is replaced by continuation(arity)
% de laatste parameter is om aan te duiden of het een dummy is of niet

constructterm(continuation(_),_) :- ! ,
		 writel(['continuation']) .
constructterm(varnr(N,T),_) :- 
		var(T), !,
        writel(['var',N]) , T = 1.
constructterm(varnr(N,T),_) :-
         !,
		 writel(['var',N,'.dref()']).
constructterm(cut(_,C),Strings) :- ! ,
		getnameindex(Strings,'cut',0,I),
		writel(['new StructureTerm(getConsts().string',I,', new HeapChoice(mach.getCUTB()),',
			constructterm(C,Strings),
			')'
			]) .

constructterm(Int,_) :- integer(Int) , ! , write('getConsts().'), posneg(Int) .
constructterm(Atom,Strings) :- atom(Atom) , ! ,
            changeIllegalTerms(Name, Atom),
			getnameindex(Strings,Name,0,I),
			writel(['new Const(getConsts().string',I,')']) .
constructterm(Term,Strings) :-
			functor(Term,N,_) ,
			Term =.. [_|Args],
            changeIllegalTerms(Name, N),
			getnameindex(Strings,Name,0,I) ,
			writel(['new StructureTerm(getConsts().string',I,',',
				newargs(Args,1,Strings),
				')'
				]) .

newargsKomma(N) :-
        N > 1, !, write(',').
newargsKomma(_).        
newargs([],_,_) .
newargs([A|Args],N,Strings) :-
		newargsKomma(N),
		M is N + 1 ,
		constructterm(A,Strings) ,
		newargs(Args,M,Strings).		

bodycont((_ :- B),Name,Arity) :- functor(B,Name,Arity) , ! ,
			writel(['getConsts().',entry_code]) .
bodycont((_ :- B),_,_) :- functor(B,call,1) , ! ,
			writel(['mach.Call1']) .
bodycont((_ :- B),_,_) :- functor(B,call,2) , ! ,
			writel(['mach.Call2']) .
bodycont((_ :- B),_,_) :- functor(B,cut,2) , ! ,
			writel(['mach.Call1']) .
bodycont((_ :- B),_,_) :- functor(B,Name,Arity) , !,
			writel(['getConsts().',Name,Arity,'cont']) .
bodycont(H, _, _) :- writel(['mach.Call1']).

decl_deref_args(-1) :- ! .
decl_deref_args(N) :- writel(['PrologObject areg',N,
				' = local_aregs[',N,'].dref() ;',wr(nl)]) ,
			M is N - 1 , 
			decl_deref_args(M) .


initforeachcontinuation([],_,_) .
initforeachcontinuation([N/A|R],N,A) :- !,	% this is entry code !
		initforeachcontinuation(R,N,A) .
initforeachcontinuation([call/1|R],N,A) :- !,	% Call1
		initforeachcontinuation(R,N,A) .
initforeachcontinuation([call/2|R],N,A) :- !,	% Call2
		initforeachcontinuation(R,N,A) .
initforeachcontinuation([cut/2|R],N,A) :- !,	% Cut2
		initforeachcontinuation(R,N,A) .
initforeachcontinuation([N/A|R],Name,Arity) :-
		B is A - 1 ,
                changeIllegalTerms(UnEscapedName, N),
		writel(['consts.',N,A,'cont = mach.loadPred("',
			UnEscapedName,
			'",',
			B,
			') ;',
			wr(nl)
			]) ,
		initforeachcontinuation(R,Name,Arity) .

%aregarrayKomma(N) :-
%       N > 0, !, write(',').
%aregarrayKomma(_).       
%aregarray(N) :- aregarray(0,N) .

%aregarray(N,Max) :- N > Max , ! .
%aregarray(N,Max) :-
%		aregarrayKomma(N) ,
%		M is N + 1 ,
%		writel(['mach.getAreg()[',N,']']) ,
%		aregarray(M,Max) . 

declforeachclause2([],_,_) .
declforeachclause2([_|R],N,ClassName) :-
			writel(['ALT.addAlternative(',
				'new ',
				ClassName,'_',N,
				'(this));', wr(nl)]) ,
			M is N + 1 ,
			declforeachclause2(R,M,ClassName) .

enableIndexing(ClassName) :- isIndexingAllowed(ClassName), !.
enableIndexing(_) :- writel(['  ALT.disable();',wr(nl)]).

declforeachclause([_],_,_) :-
    !,
    writel(['private static Alternatives ALT = null;', wr(nl),
            'private void initAlternatives() { }', wr(nl)]).
declforeachclause(AR,N,ClassName) :-
                  writel(['private Alternatives ALT = new Alternatives();', wr(nl),
                          'private void initAlternatives() {', wr(nl),
                          enableIndexing(ClassName),
                          declforeachclause2(AR,N,ClassName), wr(nl),
                          '}', wr(nl)]).


declforeachcontinuation([],_,_) .
declforeachcontinuation([N/A|R],N,A) :- ! , declforeachcontinuation(R,N,A) .
declforeachcontinuation([call/1|R],N,A) :- ! , declforeachcontinuation(R,N,A) .
declforeachcontinuation([call/2|R],N,A) :- ! , declforeachcontinuation(R,N,A) .
declforeachcontinuation([N/A|R],Name,Arity) :-
		writel(['     Code ',
			N,
			A,
			'cont ;',
			wr(nl)
		    ]) ,
		declforeachcontinuation(R,Name,Arity) .

declforeachstring([],_) .
declforeachstring([N|R],M) :- MM is M + 1 ,
			writel(['final static String string',M,
				' = "',N,'".intern() ;',wr(nl)]) ,
				declforeachstring(R,MM) .

declforeachint([]) .
declforeachint([N|R]) :- writel(['final static Int ',posneg(N),
				' = new Int(',N,') ;',wr(nl)]) ,
				declforeachint(R) .

posneg(N) :- N < 0 , ! , M is 0 - N , writel(['negint',M]) .
posneg(N) :- writel(['posint',N]) .


getnameindex([NEscaped|_],N,In,In) :- escapeFunctor(N, NEscaped), !.
getnameindex([_|R],N,In,Out) :- I is In + 1 , getnameindex(R,N,I,Out) .

continuationof([(_ :- B)|_],N/A) :- functor(B,N,A).
continuationof([_|R],F) :- continuationof(R,F) .

stringof([Cl|_],F) :- strings1(Cl,F) .
stringof([_|R],F) :- stringof(R,F) .

strings1(X,_) :- var(X) , ! , fail .
strings1((A,_),F) :- strings1(A,F) .
strings1((_,B),F) :- ! , strings1(B,F) .
strings1((A :- _),F) :- strings1(A,F) .
strings1((_ :- B),F) :- ! , strings1(B,F) .
strings1(T,F) :- functor(T,N,_) , F = N .
strings1(T,F) :- T =.. [_|Args] , stringsl(Args,F) .

strings(X,_) :- var(X) , ! , fail .
strings(A,F) :- atom(A) , ! , F = A .
strings(A,_) :- atomic(A) , ! , fail .
strings(T,F) :- functor(T,N,_) , F = N .
strings(T,F) :- T =.. [_|Args] , stringsl(Args,F) .

stringsl([T|_],F) :- strings(T,F) .
stringsl([_|R],F) :- stringsl(R,F) .

intof([Cl|_],F) :- ints(Cl,F) .
intof([_|R],F) :- intof(R,F) .

ints(X,_) :- var(X) , ! , fail .
ints(A,F) :- integer(A) , ! , F = A .
ints(A,_) :- atomic(A) , ! , fail .
ints(T,F) :- T =.. [_|Args] , intof(Args,F) .

prelude :- writel(['// Generated java file - release 0.2 - do not edit !' , wr(nl),
 	           '// Copyright August 16, 1996, KUL and CUM' , wr(nl),
                   '// Authors: Bart Demoen and Paul Tarau' , wr(nl), wr(nl)]).

%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
genmodule(Prog) :-
			modulename(ModuleName),
			modulefile(ModuleFile),
			tell(ModuleFile),
			prelude,
			writel([wr(package),
				'import be.kuleuven.jProlog.*;',
				wr(nl),
				wr(nl),
				'public class ',
				ModuleName,
				' extends Module {',
				wr(nl),
				'{ this.codes = new Code[] {',
				wr(nl),
				codeforeachpred(Prog),
				'};',
				wr(nl),
				'  this.functors = new String[]{',
				wr(nl),
				functorforeachpred(Prog),
				'};',
				wr(nl),
				'}',
				wr(nl),
				'}',
				wr(nl)
				]) ,
			told.

modulefile(ModuleName) :-
	modulename(Module),
        b_getval(targetfolder, TargetFolder),
        concat(TargetFolder, Module, MF),
	concat(MF,'.java',ModuleName).

modulename(Module) :-
  nb_current(module,Module).

codeforeachpred([]).
codeforeachpred([Pred]) :- !,
	codeforpred(Pred),
	writel([wr(nl)]).
codeforeachpred([Pred|Preds]) :-
	codeforpred(Pred),
	writel([',',wr(nl)]),
	codeforeachpred(Preds).

codeforpred(Pred) :-
	Pred = [(H :- _)|_] ,
	functor(H,N,A) , AA is A - 1,
	makename([pred_,N,'_',AA],ClassName),
	writel([	
		'new ',
		ClassName,
		'()'			
	]).

functorforeachpred([]).
functorforeachpred([Pred]) :- !,
	functorforpred(Pred),
	writel([wr(nl)]).
functorforeachpred([Pred|Preds]) :-
	functorforpred(Pred),
	writel([',',wr(nl)]),
	functorforeachpred(Preds).
    
functorforpred(Pred) :-
	Pred = [(H :- _)|_] ,
	functor(H,Functor,_),
    escapeFunctor(Functor, EscapedFunctor),
	writel([	
		'"',
		EscapedFunctor,
		'".intern()'	
	]).
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
eliminate_disjuctions_in_clauses(Clauses,NClauses) :-
	eliminate_disjunction_list(Clauses,1,NClauses).

eliminate_disjunction_list([],_,[]) :- !.
eliminate_disjunction_list([C|Cs],Index,Preds) :-
	eliminate_disjunction_clause(C,Index,NIndex,Preds,Tail),
	eliminate_disjunction_list(Cs,NIndex,Tail).	

eliminate_disjunction_clause((H :- B),Index,NIndex,[(H :- NB)|Preds],PredsTail) :-
	!,
	functor(H,F,A),
	term_variables(H,ContextVars),
	eliminate_disjunction(B,F/A,ContextVars,Index,NIndex,NB,Preds,PredsTail).
eliminate_disjunction_clause(H,Index,Index,[H|PredsTail],PredsTail).

eliminate_disjunction((G1,G2),FA,ContextVars,Index,NIndex,(NG1,NG2),Preds,PredsTail) :-
	!,
	term_variables(ContextVars+G2,ContextVars1),
	eliminate_disjunction(G1,FA,ContextVars1,Index,Index1,NG1,Preds,Preds1),
	term_variables(ContextVars+G1,ContextVars2),
	eliminate_disjunction(G2,FA,ContextVars2,Index1,NIndex,NG2,Preds1,PredsTail).
eliminate_disjunction((G1->G2;G3),FA,ContextVars,Index,NIndex,DisjHead,Preds,PredsTail) :-
	!,
	term_variables((G1->G2;G3),ScopeVars),
	intersect_eq(ScopeVars,ContextVars,HeadVars),
	make_disj_pred(FA,HeadVars,Index,Index0,DisjHead),
	copy_term((DisjHead :- (G1,!,G2)),Clause1),
	eliminate_disjunction_clause(Clause1,Index0,Index1,Preds,Preds1),
	copy_term((DisjHead :- G3),Clause2),
	eliminate_disjunction_clause(Clause2,Index1,NIndex,Preds1,PredsTail).
eliminate_disjunction((G1;G2),FA,ContextVars,Index,NIndex,DisjHead,Preds,PredsTail) :-
	!,
	term_variables((G1;G2),ScopeVars),
	intersect_eq(ScopeVars,ContextVars,HeadVars),
	make_disj_pred(FA,HeadVars,Index,Index0,DisjHead),
	copy_term((DisjHead :- G1),Clause1),
	eliminate_disjunction_clause(Clause1,Index0,Index1,Preds,Preds1),
	copy_term((DisjHead :- G2),Clause2),
	eliminate_disjunction_clause(Clause2,Index1,NIndex,Preds1,PredsTail).
eliminate_disjunction(B,_FA,_ContextVars,Index,Index,B,Preds,Preds).
	
make_disj_pred(F/A,Args,Index,NIndex,Head) :-
	NIndex is Index + 1,
	concat_atom([F,A,'_disj_',Index],Functor),
	Head =.. [Functor|Args].	

intersect_eq([], _, []).
intersect_eq([X|Xs], Ys, L) :-
        memberchk_eq(X, Ys), !,
        L = [X|T],
        intersect_eq(Xs, Ys, T).
intersect_eq([X|Xs], Ys, L) :-
        !,
        intersect_eq(Xs, Ys, L).

memberchk_eq(X, [X|_]) :- !.
memberchk_eq(X, [_|Ys]) :-
   !, memberchk_eq(X, Ys).



% main :- comp('board') , fail .
% main :- comp('test') , fail .
% main :- comp('read.pl') , fail .
% main :- comp('someprolog') , fail .
% main :- comp('chat') , fail .
% main :- comp('boyer') , fail .

