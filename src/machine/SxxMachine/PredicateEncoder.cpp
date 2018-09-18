using namespace std;

#include "PredicateEncoder.h"
#include "StringBuilder.h"
#include "NumberFormatException.h"

namespace SxxMachine
{

	wstring PredicateEncoder::encode(const wstring& pkg, const wstring& functor, const int& arity)
	{
		std::vector<char> x = functor.toCharArray();
		StringBuilder* sb = new StringBuilder(pkg == ""?0:pkg.length() + x.size()*5 + 10);
		sb->append("PRED_");
		int i = 0;
		int s = i;
		while(i < x.size())
		{
			if(!((x[i] >= 'a' && x[i] <= 'z') || (x[i] >= 'A' && x[i] <= 'Z') || (x[i] >= '0' && x[i] <= '9') || x[i] == '_' || x[i] == '$'))
			{
				sb->append(x, s, i - s);
				wstring hex = Long::toHexString(x[i])->toUpperCase();
				int hl = hex.length();
				if(hl > 7)
				{
					hex = hex.substr(4, 4);
				} else
				{
					while(hl < 4)
					{
						hex = "0" + hex;
						hl++;
					}
				}
				sb->append('$')->append(hex);
				s = i + 1;
			}
			i++;
		}
		if(s < x.size())
		{
			sb->append(x, s, x.size() - s);
		}
		sb->append('_')->append(arity);

		if(pkg != "")
		{
			if(!StringHelper::endsWith(pkg, "$"))
			{
				pkg += ".";
			}
		} else
		{
			pkg = "";
		}
		return pkg + sb->toString();
	}

	wstring PredicateEncoder::decodeFunctor_2(const wstring& className)
	{
		  // Remove the Java package name, if present.
		  int dot = (int)className.rfind('.');
		  if(0 < dot)
		  {
			className = className.substr(dot + 1);
		  }

		  // Trim the common PRED_ prefix.
		  if(StringHelper::startsWith(className, "PRED_"))
		  {
			className = className.substr((wstring("PRED_")).length());
		  }

		  // Drop the arity from the end.
		  int us = (int)className.rfind('_');
		  if(0 < us)
		  {
			className = className.substr(0, us);
		  }

		  Pattern* p = Pattern::compile("\\$([0-9A-F]{4})");
		  Matcher* m = p->matcher(className);
		  StringBuilder* r = new StringBuilder();
		  while(m->find())
		  {
			char c = static_cast<char>(static_cast<Integer>(m->group()));
//JAVA TO C++ CONVERTER TODO TASK: There is no native C++ equivalent to 'toString':
			m->appendReplacement(r, Character::toString(c));
		  }
		  m->appendTail(r);
		  return r->toString();
	}

	int PredicateEncoder::decodeArity(const wstring& className)
	{
	  // Drop the arity from the end.
	  int finish = (int)className.rfind('_');
	  if(finish < 0)
	  {
		 return -1;
	  }
	  if(StringHelper::endsWith(className, "_2"))
	  {
		  return 2;
	  }
	  if(StringHelper::endsWith(className, "_1"))
	  {
		  return 1;
	  }
	  if(StringHelper::endsWith(className, "_3"))
	  {
		  return 3;
	  }
	  if(StringHelper::endsWith(className, "_0"))
	  {
		  return 0;
	  }
	  if(StringHelper::endsWith(className, "_4"))
	  {
		  return 4;
	  }
	  if(StringHelper::endsWith(className, "_5"))
	  {
		  return 5;
	  }
	  if(StringHelper::endsWith(className, "_6"))
	  {
		  return 6;
	  }
	  if(StringHelper::endsWith(className, "_7"))
	  {
		  return 7;
	  }
	  if(StringHelper::endsWith(className, "_8"))
	  {
		  return 8;
	  }
	  if(StringHelper::endsWith(className, "_9"))
	  {
		  return 9;
	  }
	  return stoi(className.substr(finish) + 1);
	}

//JAVA TO C++ CONVERTER TODO TASK: Most Java annotations will not have direct C++ equivalents:
//ORIGINAL LINE: @SuppressWarnings("fallthrough") public static String decodeFunctor(String className)
	wstring PredicateEncoder::decodeFunctor(const wstring& className)
	{
		int length = className.length();
		// Remove the Java package name, if present.
		int start = (int)className.rfind('.');
		start++;
		// Trim the common PRED_ prefix.
		if(className.regionMatches(start, "PRED_", 0, 5))
		{
			start += 5;
		}
		// Drop the arity from the end.
		int finish = (int)className.rfind('_');
		if(finish < 0)
		{
			finish = length;
		}
		// replace $XXXX with character with code XXXX
		StringBuilder* sb = new StringBuilder(length);
		int index = start;
		int middle = index;
		while(index < finish)
		{
			index = (int)className.find('$', index);
			if(index < 0)
			{
				index = finish;
			} else if(index + 4 < finish)
			{
				try
				{
//JAVA TO C++ CONVERTER TODO TASK: Only single-argument parse and valueOf methods are converted:
//ORIGINAL LINE: int c = Integer.parseInt(className.substring(index+1, (index+5) - (index+1)), 16);
					int c = Integer::valueOf(className.substr(index + 1, (index + 5) - (index + 1)), 16);
					sb->append(className.substr(middle, index - middle));
					switch(c)
					{
					case '\\':
						sb->append("\\\\");
						break;
					case '$':
						sb->append("\\$");
					default:
						sb->append(static_cast<char>(c));
						break;
					}
					index = middle = index + 5;
				} catch(const NumberFormatException& e)
				{
					index++;
				}
			} else
			{
				index++;
			}
		}
		if(middle < finish)
		{
			sb->append(className.substr(middle, finish - middle));
		}
		return sb->toString();
	}

	void PredicateEncoder::main(std::vector<wstring>& argv)
	{
	wstring p = argv[0];
	wstring f = argv[1];
	int n = (stoi(argv[2])).value();
	cout << p << ":" << f << "/" << n << endl;
	cout << PredicateEncoder::encode(p,f,n) << endl;
	}
}
