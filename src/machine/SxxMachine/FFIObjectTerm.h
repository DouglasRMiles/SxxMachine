#ifndef FFIOBJECTTERM
#define FFIOBJECTTERM

#include "SystemObject.h"
#include <string>
#include <any>
#include <typeinfo>
#include "exceptionhelper.h"
#include "stringbuilder.h"

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine { class PrologException; }
namespace SxxMachine { class Trail; }
namespace SxxMachine { class Term; }
class StringBuilder;

namespace SxxMachine
{


	/**
	 * Java-term.<br>
	 * The <code>JavaObjectTerm</code> class wraps a java object.<br>
	 * 
	 * <pre>
	 *  import java.util.Hashtable;
	 *  Term t = new JavaObjectTerm(new Hashtable());
	 *  Hashtable hash = (Hashtable)(t.asJavaObjectlTerm().object());
	 * </pre>
	 *
	 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
	 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
	 * @version 1.0
	 */
//JAVA TO C++ CONVERTER TODO TASK: Most Java annotations will not have direct C++ equivalents:
//ORIGINAL LINE: @SuppressWarnings("rawtypes") public class FFIObjectTerm extends SystemObject
	class FFIObjectTerm : public SystemObject
	{
	public:
		FFIObjectTerm* toClone() override;

	  std::any toObject() override;

	  bool isObject() override;


	  std::any val;


	  /*
	  private boolean available;
	  
	  synchronized public void suspend() {
	  available=false;
	  while(!available) {
	    try {
	      wait();
	    }
	    catch(InterruptedException e) {}
	  }
	  }
	  
	  synchronized public void resume() {
	  available=true;
	  notifyAll();
	  }
	  */
	  bool isImmutable() override final;
	  std::string toAtomName() throw(PrologException) override;
		/** Holds a java object that this <code>JavaObjectTerm</code> wraps. */
	private:
		const std::any obj;
	public:
		bool immutable = true;
		bool isFFIObject() override;
		/** Constructs a new Prolog java-term that wraps the argument object. */
		FFIObjectTerm(std::any _obj);
		/** Sets the argument object to this <code>JavaObjectTerm</code>. */
	//    public void setObject(Object _obj) {
	//    	if ( _obj==null) {
	//    		throw new NullPointerException("Error: JavaObjectTerm can not wrap null");
	//    	}
	//    	this.obj   = _obj;
	//    }
		/** Returns the object wrapped by this <code>JavaObjectTerm</code>. */
		std::any object() override;
		/** Returns a <code>java.lang.Class</code> of object wrapped by this <code>JavaObjectTerm</code>. */
		std::type_info getClazz() override;
		std::string name() override;
		bool unifyImpl(Term* t, Trail* trail) override;
		/** 
		 * Check whether the wrapped object is convertible with the given Java class type.
		 * @return the <code>boolean</code> whose value is
		 * <code>convertible(getClazz(), type)</code>.
		 * @see #getClazz()
		 * @see Term#convertible(Class, Class)
		 */
		bool convertible(std::type_info type) override;
		std::any toJava() override;
		bool equalsTerm(Term* o, Comparator* comparator) override;
		int termHashCodeImpl() override;

		/** Adds a string representation of this <code>JavaObjectTerm</code> to given StringBuilder instance. */
		void toStringImpl(const int& printFlags, StringBuilder* sb) override;
		/* Comparable */
		/** 
		 * Compares two terms in <em>Prolog standard order of terms</em>.<br>
		 * It is noted that <code>t1.compareTo(t2) == 0</code> has the same
		 * <code>boolean</code> value as <code>t1.equals(t2)</code>.
		 * @param anotherTerm the term to compared with. It must be dereferenced.
		 * @return the value <code>0</code> if two terms are identical; 
		 * a value less than <code>0</code> if this term is <em>before</em> the <code>anotherTerm</code>;
		 * and a value greater than <code>0</code> if this term is <em>after</em> the <code>anotherTerm</code>.
		 */
		int compareTo(Term* anotherTerm) override;

	  int type() override;
	};

}


#endif	//#ifndef FFIOBJECTTERM
