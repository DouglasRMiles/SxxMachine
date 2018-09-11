package com.googlecode.prolog_cafe.lang;

import java.util.IdentityHashMap;

/**
 * A term to represent errors, extends {@link StructureTerm}, 
 * additionally holds reference to {@link Throwable}, which this term represents.
 * @author a.semenov@unipro.ru
 *
 */
public class ErrorTerm extends StructureTerm {

	private final Throwable error;
	
	public ErrorTerm(Throwable error, String name, Term... args){
		super(name, args);
		this.error = error;
	}
	
	public ErrorTerm(Throwable error, SymbolTerm _functor, Term... _args){
		super(_functor, _args);
		this.error = error;
	}

	public Throwable getThrowable() {
		return error;
	}	
	
	@Override
	protected Term copy(IdentityHashMap<VariableTerm,VariableTerm> copyHash) {
		Term[] a = new Term[arity()];
		for (int i = 0; i < a.length; i++){
			a[i] = arg(i).copy(copyHash);
		}
		return new ErrorTerm(error, functor(), a);
	}
}
