using namespace std;

#include "PrologLogger.h"
#include "Predicate.h"
#include "ChoicePointFrame.h"
#include "../../builtin/SxxMachine/FILE_builtins.h"
#include "Operation.h"
#include "../../exceptions/SxxMachine/PrologException.h"
#include "../../exceptions/SxxMachine/JavaException.h"
#include "../../exceptions/SxxMachine/BuiltinException.h"
#include "StringBuilder.h"

namespace SxxMachine
{
//	import static SxxMachine.TermData.Op;
//	import static SxxMachine.TermData.VA;

	Logger* PrologLogger::getJLogger()
	{
	  return this->logger;
	}

	PrologLogger::PrologLogger(Logger* logger) : logger(logger)
	{
	  this->stackFrame = std::vector<Predicate*>(256);
	  this->indent = std::vector<char>(256);
	}

	void PrologLogger::init(ChoicePointFrame* initialChoicePointFrame)
	{
		this->stackTop = 0;
		//Arrays.fill(stackFrame, null);
		this->stackFrame[0] = Op(SxxMachine::FILE_builtins::PRED_true_0_static_exec,VA(),nullptr); // TODO check if null is ok
		this->normalExecution = true;
		initialChoicePointFrame->ownerPredicate = this->stackFrame[this->stackTop];
		initialChoicePointFrame->loggerStackTop = this->stackTop;
	}

	void PrologLogger::fail(Operation next, ChoicePointFrame* entry)
	{
		//  write to log
	  if(this->loggerEnable)
	  {
		  this->logger->log(Level::FINER, [&] ()
		  {
		  stringBuilder->setLength(0);
		  stringBuilder->append(this->indent, 1, this->stackTop)->append("failure => ");
		  stringBuilder->append(next);
		  return stringBuilder->toString();
		  }});
		this->normalExecution = false;
		this->stackTop = entry->loggerStackTop;
		this->stackFrame[this->stackTop] = static_cast<Predicate*>(entry->ownerPredicate);
	  }

	/**
		   * @param next  
		   */
	final void jtry(Operation p, Operation next, ChoicePointFrame entry)
	{
		entry->ownerPredicate = this->stackFrame[this->stackTop];
		entry->loggerStackTop = this->stackTop;
		//  write to log
		if(this->loggerEnable)
		{
			this->logger->log(Level::FINER, [&] ()
			{
			stringBuilder->setLength(0);
			stringBuilder->append(this->indent, 1, this->stackTop)->append("try ");
			stringBuilder->append(this->stackFrame[this->stackTop]->toString());
			stringBuilder->append(" => ");
			stringBuilder->append(p);
			return stringBuilder->toString();
			}});
		}
	/**
		   * @param next  
		   */
	final void retry(Operation p, Operation next, ChoicePointFrame entry)
	{
		//  write to log
		if(this->loggerEnable)
		{
			this->logger->log(Level::FINER, [&] ()
			{
			stringBuilder->setLength(0);
			stringBuilder->append(this->indent, 1, this->stackTop)->append("retry ");
			stringBuilder->append(entry->ownerPredicate->toString());
			stringBuilder->append(" => ");
			stringBuilder->append(p);
			return stringBuilder->toString();
			}});
		this->normalExecution = false;
		this->stackTop = entry->loggerStackTop;
		this->stackFrame[this->stackTop] = static_cast<Predicate*>(entry->ownerPredicate);
		}
	final void trust(Operation p, ChoicePointFrame entry)
	{
		// write to log
	  if(this->loggerEnable)
	  {
		  this->logger->log(Level::FINER, [&] ()
		  {
		  stringBuilder->setLength(0);
		  stringBuilder->append(this->indent, 1, this->stackTop)->append("trust ");
		  stringBuilder->append(entry->ownerPredicate->toString());
		  stringBuilder->append(" => ");
		  stringBuilder->append(p);
		  return stringBuilder->toString();
		  }});
		this->normalExecution = false;
		this->stackTop = entry->loggerStackTop;
		this->stackFrame[this->stackTop] = static_cast<Predicate*>(entry->ownerPredicate);
	  }
	final void beforeExec(Operation code)
	{
		Level* level;
		// do afterExec
		if(dynamic_cast<Predicate*>(code) != nullptr)
		{
			if(this->normalExecution)
			{
				while(this->stackTop >= 0 && this->stackFrame[this->stackTop]->cont == code)
				{
					this->stackTop--;
				}
				this->stackTop++;
				if(this->stackTop >= this->stackFrame.size())
				{
					ensureCapacity();
				}
			}
			// most important
			this->stackFrame[this->stackTop] = static_cast<Predicate*>(code);
			level = Level::FINE;
		} else
		{
			level = Level::FINER;
		}
		this->normalExecution = true;
		//  if logger.isLoggable(Level.FINE) write code to log
		if(this->loggerEnable)
		{
			this->logger->log(level, [&] ()
			{
			stringBuilder->setLength(0);
			stringBuilder->append(this->indent, 1, this->stackTop)->append(": ");
			if(dynamic_cast<Predicate*>(code) != nullptr)
			{
				(static_cast<Predicate*>(code))->toString(stringBuilder);
			} else
			{
				stringBuilder->append(code);
			}
			return stringBuilder->toString();
			}});
		}

		  final void printStack(Operation codeP, StringBuilder stringBuilder)
		  {
	int stackTop = this->stackTop;
	Operation code = nullptr;
	wstring indent = wstring("\n") + " ";
	for(int i = 0; i < stackTop; i++)
	{
	  code = this->stackFrame[i];
	  stringBuilder->append(indent);
	  if(code == codeP)
	  {
		break;
	  } else
	  {
		stringBuilder->append("ABOVE: ");
	  }
	  if(dynamic_cast<Predicate*>(code) != nullptr)
	  {
//JAVA TO C++ CONVERTER TODO TASK: There is no native C++ equivalent to 'toString':
		(static_cast<Predicate*>(code))->toString(stringBuilder);
	  } else
	  {
//JAVA TO C++ CONVERTER TODO TASK: There is no native C++ equivalent to 'toString':
		stringBuilder->append(code->toString());
	  }
	}
	code = codeP;
	stringBuilder->append("\nHERE: ");
	if(dynamic_cast<Predicate*>(code) != nullptr)
	{
	  (static_cast<Predicate*>(code))->toRest(indent + "  GOTO: ", stringBuilder);
	}
		  }
private:
	void ensureCapacity()
	{
		std::vector<Predicate*> array_RenamedTODO(this->stackFrame.size()*2);
		System::arraycopy(this->stackFrame, 0, array_RenamedTODO, 0, this->stackFrame.size());
		this->stackFrame = array_RenamedTODO;
		this->indent = std::vector<char>(this->stackFrame.size());
		Arrays::fill(this->indent, ' ');
	}
public:
	final PrologException execThrows(runtime_error t)
	{
		if(!(dynamic_cast<PrologException*>(t) != nullptr) || !(static_cast<PrologException*>(t))->hasPrologStackTrace())
		{
			std::vector<Operation> array_RenamedTODO(this->stackTop);
			for(int i = this->stackTop, k = 0; i > 0; i--)
			{
				array_RenamedTODO[k] = this->stackFrame[i];
				k++;
			}
			// wrap t into JavaException if it is not PrologException
			if(!(dynamic_cast<PrologException*>(t) != nullptr))
			{
			  t::printStackTrace();
				t = new JavaException(t);
			}
			// add stacktrace into t
			(static_cast<PrologException*>(t))->setPrologStackTrace(array_RenamedTODO);
			if(dynamic_cast<BuiltinException*>(t) != nullptr)
			{
				(static_cast<BuiltinException*>(t))->goal = this->stackFrame[this->stackTop];
			}
		}
		// write to log
		this->logger->log(Level::FINE, "", t);
		return static_cast<PrologException*>(t);
	}
	final void printStackTrace(runtime_error err)
	{
		this->logger->log(Level::SEVERE, "", err);
		if(!this->logger->getUseParentHandlers())
		{ // propagate error outside
			Logger::getLogger("").log(Level::SEVERE, "", err);
		}
	}
	final void close()
	{
		Arrays::fill(this->stackFrame, this->stackTop + 1, this->stackFrame.size(), nullptr);
	}
	}

	}
	}
