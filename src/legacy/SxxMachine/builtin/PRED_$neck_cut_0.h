#pragma once

#include "../../../machine/SxxMachine/Predicate.h"

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine
{
	class Operation;
	class Prolog;
}

namespace SxxMachine
{

	using Operation = SxxMachine::Operation;
	using Predicate = SxxMachine::Predicate;
	using Prolog = SxxMachine::Prolog;
	/**
	 <code>'$neck_cut'/0</code><br>
	 @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
	 @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
	 @version 1.0
	*/
	class PRED_$neck_cut_0 : public Predicate
	{

	public:
		PRED_$neck_cut_0(Operation cont);

		Operation exec(Prolog *engine) override;
	};

}
