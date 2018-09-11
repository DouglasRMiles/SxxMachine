package com.googlecode.prolog_cafe.builtin;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import com.googlecode.prolog_cafe.exceptions.IllegalDomainException;
import com.googlecode.prolog_cafe.exceptions.IllegalTypeException;
import com.googlecode.prolog_cafe.exceptions.JavaException;
import com.googlecode.prolog_cafe.exceptions.PrologException;
import com.googlecode.prolog_cafe.lang.ListTerm;
import com.googlecode.prolog_cafe.lang.Operation;
import com.googlecode.prolog_cafe.lang.Predicate.P2;
import com.googlecode.prolog_cafe.lang.Prolog;
import com.googlecode.prolog_cafe.lang.StructureTerm;
import com.googlecode.prolog_cafe.lang.SymbolTerm;
import com.googlecode.prolog_cafe.lang.Term;
/**
 * <p>write_domain_definitions(+OutputDir,+DomainDefinitionsList)
 * <p>Writes domain definitions into properties file in the folder corresponding to package.
 * <p>Arguments are:<UL>
 * <LI> OutputDir - the base directory for output. It will be used as prefix for package directory</LI>
 * <LI> DomainDefinitionsList - the list of domain definitions. Each item is expected to be complex StructureTerm:
 * packageName:domainName = (aaa;bbb*;ccc(ddd,eee))</LI>
 * </UL>
 * <p>All items must reference the same package.
 * <p>If the properties file already exist, its content will be merged with given domain definitions.
 * The existing domain definition will be overwritten by new one.
 * <p>The predicate is thread safe. Concurrent threads will write definitions sequentially, one by one, 
 * merging the domain definitions, written earlier. The execution order for competing threads is not defined.   
 *   
 * @author semenov
 *
 */
public class PRED_write_domain_definitions_2 extends P2 {

	public PRED_write_domain_definitions_2() {
	}

	public PRED_write_domain_definitions_2(Term arg1, Term arg2, Operation cont) {
		this.arg1 = arg1;
		this.arg2 = arg2;
		this.cont = cont;
	}

	@Override
	public Operation exec(Prolog engine) throws PrologException {
		Term a1 = arg1.dereference();
		Term a2 = arg2.dereference();
		
		// input check
		// a1 is output directory
		if (!(a1 instanceof SymbolTerm)){
			throw new IllegalTypeException(this, 1, "atom", a1);
		}
		// a2 is a list of domain definitions in form package:name = (aaa;bbb*;ccc(ddd,eee))
		if (!a2.isNil() && !(a2 instanceof ListTerm)){
			throw new IllegalTypeException(this, 2, "list", a2);
		}
		// process domain definitions
		String packageName = null;
		Properties p = new Properties();
		Term lt = a2;
		while (!lt.isNil()) {
			Term t = ((ListTerm) lt).car();
			lt = ((ListTerm) lt).cdr();
			
			if (!(t instanceof StructureTerm) || !"=".equals(t.name()) || t.arity()!=2){
				throw new IllegalDomainException(this, 2, "package:name = (aaa;bbb*;ccc(ddd,eee))", t);
			}
			Term packageAndName = t.arg(0);
			if (!(packageAndName instanceof StructureTerm) || !":".equals(packageAndName.name()) || packageAndName.arity()!=2){
				throw new IllegalDomainException(this, 2, "package:name = (aaa;bbb*;ccc(ddd,eee))", t);
			}
			Term packageTerm = packageAndName.arg(0);
			if (packageName==null){
				packageName = packageTerm.name();
			} else if (!packageName.equals(packageTerm.name())){
				throw new IllegalDomainException(this, 2, "same package in every list item", a2);
			}
			Term name = packageAndName.arg(1);
			
			Term definition = t.arg(1);
			StringBuilder sb = new StringBuilder();
			Term d = definition;
			while (";".equals(d.name())){
				sb.append(d.arg(0).toString()).append(';');
				d = d.arg(1);
			}
			sb.append(d.toString());
			p.put(name.name(), sb.toString());
		}
		if (packageName!=null && !p.isEmpty()){
			writeDomainDefinitions(a1.name(), packageName, p);
		}
		
		return cont;
	}

	/**
	 * Writes given domain definition as properties file for given package and destination folder.
	 * The method is static and synchronized to allow writing from  different threads.
	 * Writing from different processes will lead to unpredicted results. 
	 * @param folder
	 * @param packageName
	 * @param domains
	 */
	private static synchronized void writeDomainDefinitions(String folder, String packageName, Properties domains) {
		if (folder==null || "".equals(folder)){
			folder = ".";
		}
		File dir = new File(folder, packageName.replace('.',File.separatorChar));
		File file = new File(dir, "domain.properties");
		Properties p = new Properties();
		if (file.exists()){
			// read the file first
			FileInputStream in = null;
			try {
				in = new FileInputStream(file);
				p.load(in);
				
			} catch (IOException e) {
				throw new JavaException(e);
			} finally {
				if (in!=null) {
					try {
						in.close();
					} catch (IOException e) {
						// ignore since we can do nothing about it
					}
				}
			}
		}
		p.putAll(domains);
		FileOutputStream out = null;
		try {
			out = new FileOutputStream(file);
			p.store(out, "");
		} catch (IOException e) {
			throw new JavaException(e);
		} finally {
			if (out!=null) {
				try {
					out.close();
				} catch (IOException e) {
					// ignore since we can do nothing about it
				}
			}
		}	
	}
}
