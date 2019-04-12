
:- set_prolog_flag(double_quotes,string).

:- asserta(animal_string_pro(goat)).
animal_string_pro("elephant").
animal_string_pro(X) :-
	write("please type one more animal name: "),
	read(X).

	
:- set_prolog_flag(double_quotes,atom).

:- asserta(animal_atom_pro(goat)).
animal_atom_pro("elephant").
animal_atom_pro(X) :-
	write("please type one more animal name: "),
	read(X).

	
:- set_prolog_flag(double_quotes,chars).
	
	
animal_chars_pro(goat).
animal_chars_pro("elephant").
animal_chars_pro(X) :-
	write("please type one more animal name: "),
	read(X).	
	
	
:- listing.

:- listing(animal_chars_pro/1).	