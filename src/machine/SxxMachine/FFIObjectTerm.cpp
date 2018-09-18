using namespace std;

#include "FFIObjectTerm.h"
#include "../../exceptions/SxxMachine/PrologException.h"
#include "Trail.h"
#include "Term.h"
#include "OpVisitor.h"

namespace SxxMachine
{

	FFIObjectTerm *FFIObjectTerm::toClone()
	{
	  return new FFIObjectTerm(val);
	}

	any FFIObjectTerm::toObject()
	{
		return val;
	}

	bool FFIObjectTerm::isObject()
	{
		return true;
	}

	bool FFIObjectTerm::isImmutable()
	{
		return immutable;
		// FIXME this.obj is not final
	}

	wstring FFIObjectTerm::toAtomName() throw(PrologException)
	{
	  return "" + obj;
	}

	bool FFIObjectTerm::isFFIObject()
	{
		return true;
	}

	FFIObjectTerm::FFIObjectTerm(any _obj) : obj(_obj)
	{
		if (_obj == nullptr)
		{
			throw NullPointerException("Error: constructing JavaObjectTerm around null");
		}
	}

	any FFIObjectTerm::object()
	{
		return this->obj;
	}

	type_info FFIObjectTerm::getClazz()
	{
		return this->obj.type();
	}

	wstring FFIObjectTerm::name()
	{
		return "";
	}

	bool FFIObjectTerm::unifyImpl(Term *t, Trail *trail)
	{
		t = t->dref();
		return (t->isVar()) ? t->bind(this, trail) : ((t->isFFIObject()) && this->obj == ((t)->object()));
	}

	bool FFIObjectTerm::convertible(type_info type)
	{
		return convertible(this->obj.type(), type);
	}

	any FFIObjectTerm::toJava()
	{
		return this->obj;
	}

	bool FFIObjectTerm::equalsTerm(Term *o, OpVisitor *comparator)
	{
		return o->isFFIObject() && this->obj == ((o)->object());
	}

	int FFIObjectTerm::termHashCodeImpl()
	{
		return System::identityHashCode(this->obj);
	}

	void FFIObjectTerm::toStringImpl(int printFlags, StringBuilder *sb)
	{
		sb->append(this->obj.type().getName());
		sb->append("(0x");
		sb->append(Integer::toHexString(termHashCode()));
		sb->append(")");
	}

	int FFIObjectTerm::compareTo(Term *anotherTerm)
	{ // anotherTerm must be dereferenced.
		if ((anotherTerm->isVar()) || (anotherTerm->isNumber()) || (anotherTerm->isSymbol()) || (anotherTerm->isCons()) || (anotherTerm->isStructure()))
		{
			return AFTER;
		}
		if (!(anotherTerm->isFFIObject()))
		{
			return BEFORE;
		}
		if (this->obj == ((anotherTerm)->object()))
		{
			return EQUAL;
		}
		return this->obj.hashCode() - (anotherTerm)->object().hashCode(); //???
	}

	int FFIObjectTerm::type()
	{
	  return TYPE_JAVA_OBJECT;
	}
}
