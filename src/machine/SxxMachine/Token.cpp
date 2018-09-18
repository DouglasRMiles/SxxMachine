using namespace std;

#include "Token.h"

namespace SxxMachine
{

	bool Token::isSolo(int c)
	{
		return (c == '!' || c == ';');
	}

	bool Token::isSymbol(int c)
	{
		switch (c)
		{
		case '+':
		case '-':
		case '*':
		case '/':
		case '\\':
		case '^':
		case '<':
		case '>':
		case '=':
		case '`':
		case '~':
		case ':':
		case '.':
		case '?':
		case '@':
		case '#':
		case '$':
		case '&':
			return true;
		default:
			return false;
		}
	}

	int Token::read_token(StringBuilder *s, PushbackReader *in_Renamed) throw(IOException)
	{
	int c, c1;
	int rc;
	c = in_Renamed->read(); // get 1st. char
	if (c == -1)
	{
		s->append("end_of_file");
		return TOKEN_END_OF_FILE;
	}
	if (isdigit(static_cast<char>(c)))
	{
		return read_number(c, s, in_Renamed);
	}
	if (islower(static_cast<char>(c)))
	{
		rc = read_word(c, s, in_Renamed);
		if (rc > 0)
		{
		rc = 'A';
		}
		return rc;
	}
	if (isupper(static_cast<char>(c)) || c == '_')
	{
		rc = read_word(c, s, in_Renamed);
		if (rc > 0)
		{
		rc = 'V';
		}
		return rc;
	}
	switch (c)
	{
	case '(':
	case ')':
	case '[':
	case ']':
	case '{':
	case '}':
	case ',':
	case '|':
		s->append(static_cast<char>(c));
		return c;
	case '.': // full stop or symbol
		c1 = in_Renamed->read();
		if (c1 == -1 || c1 <= ' ')
		{
		s->append(".");
		return '.';
		}
		in_Renamed->unread(c1);
		break;
	case '%': // one line comment
		s->append(" ");
		while ((c1 = in_Renamed->read()) != '\n')
		{
		if (c1 == -1)
		{
			return ' ';
		}
		}
		return ' ';
	case '/': // start of comment or symbol
		if ((c1 = in_Renamed->read()) == '*')
		{
		s->append(" ");
		while (true)
		{
			while ((c1 = in_Renamed->read()) != '*')
			{
			if (c1 == -1)
			{
				s->append("unexpected end_of_file");
				return -2;
			}
			}
			if ((c1 = in_Renamed->read()) == '/')
			{
			return ' ';
			}
			in_Renamed->unread(c1);
		}
		}
		in_Renamed->unread(c1);
		break;
	case '\'':
		rc = read_quoted(c, s, in_Renamed);
		if (rc > 0)
		{
		rc = 'A';
		}
		return rc;
	case '"':
		rc = read_quoted(c, s, in_Renamed);
		if (rc > 0)
		{
		rc = 'S';
		}
		return rc;
	case '-':
	{
		// need special handling for Integer.MIN_VALUE - it must be returned with the sign symbol,
		// otherwise Integer.parseInt() will fail to parse it
		c1 = in_Renamed->read();
		StringBuilder *s1 = new StringBuilder("-");
		if (isdigit(static_cast<char>(c1)))
		{
			// potential match, have to read whole number
			rc = read_number(c1, s1, in_Renamed);
			try
			{
				if (rc == TOKEN_INTEGER && static_cast<Integer>(s1->toString()) == numeric_limits<int>::min())
				{
					s->append(s1);
					return TOKEN_INTEGER;
				}
				if (rc == TOKEN_LONG && static_cast<long long>(s1->toString()) == numeric_limits<long long>::min())
				{
					s->append(s1);
					return TOKEN_LONG;
				}
			}
			catch (const runtime_error &e)
			{
				// ignore and unread the number and handle minus and number separately
			}
		}
		else
		{
			s1->append(static_cast<char>(c1)); // append for subsequent unread
		}
		// unread s1 except first character in it
		std::vector<char> cbuf(s1->length() - 1);
		s1->getChars(1, s1->length(), cbuf, 0);
		in_Renamed->unread(cbuf);
		rc = read_symbol(c, s, in_Renamed);
		if (rc > 0)
		{
			rc = 'A';
		}
		return rc;
	}
	default:
		break;
	}
	if (isSolo(c))
	{
		s->append(static_cast<char>(c));
		return 'A';
	}
	if (isSymbol(c))
	{
		rc = read_symbol(c, s, in_Renamed);
		if (rc > 0)
		{
		rc = 'A';
		}
		return rc;
	}
	s->append(" ");
	return ' ';
	}

	int Token::read_number(int c, StringBuilder *s, PushbackReader *in_Renamed) throw(IOException)
	{
		int c1, c2, c3;
		in_Renamed->unread(c);
		for (c1 = in_Renamed->read(); isdigit(static_cast<char>(c1)); c1 = in_Renamed->read())
		{
			s->append(static_cast<char>(c1));
		}
		if (c1 == 'L')
		{
			return TOKEN_LONG;
		}
		if (c1 != '.')
		{
			in_Renamed->unread(c1);
			return number_type(s);
		}
		c2 = in_Renamed->read();
		if (!isdigit(static_cast<char>(c2)))
		{
			in_Renamed->unread(c2);
			in_Renamed->unread(c1);
			return number_type(s);
		}
		s->append(static_cast<char>(c1));
		in_Renamed->unread(c2);
		for (c1 = in_Renamed->read(); isdigit(static_cast<char>(c1)); c1 = in_Renamed->read())
		{
			s->append(static_cast<char>(c1));
		}
		// in.unread(c1);
		// return 2;
		if (c1 != 'E' && c1 != 'e')
		{
			in_Renamed->unread(c1);
			return TOKEN_DOUBLE;
		}
		c2 = in_Renamed->read();
		if (c2 == '-' || c2 == '+')
		{
			c3 = in_Renamed->read();
			if (!isdigit(static_cast<char>(c3)))
			{
				in_Renamed->unread(c3);
				in_Renamed->unread(c2);
				in_Renamed->unread(c1);
				return TOKEN_DOUBLE;
			}
			s->append(static_cast<char>(c1));
			s->append(static_cast<char>(c2));
			in_Renamed->unread(c3);
		}
		else if (isdigit(static_cast<char>(c2)))
		{
			s->append(static_cast<char>(c1));
			in_Renamed->unread(c2);
		}
		else
		{
			in_Renamed->unread(c2);
			in_Renamed->unread(c1);
			return TOKEN_DOUBLE;
		}
		for (c1 = in_Renamed->read(); isdigit(static_cast<char>(c1)); c1 = in_Renamed->read())
		{
			s->append(static_cast<char>(c1));
		}
		in_Renamed->unread(c1);
		return TOKEN_DOUBLE;
	}

	int Token::number_type(StringBuilder *s)
	{
		int length = s->length();
		if (length < 10)
		{
			return TOKEN_INTEGER;
		}
		else if (length > 10)
		{
			return TOKEN_LONG;
		}
		try
		{
			static_cast<Integer>(s->toString());
			return TOKEN_INTEGER;
		}
		catch (const NumberFormatException &e)
		{
			return TOKEN_LONG;
		}
	}

	int Token::read_word(int c, StringBuilder *s, PushbackReader *in_Renamed) throw(IOException)
	{
	int c1;
	in_Renamed->unread(c);
	for (;;)
	{
		c1 = in_Renamed->read();
		if (!isalnum(static_cast<char>(c1)) && c1 != '_')
		{
		break;
		}
		s->append(static_cast<char>(c1));
	}
	in_Renamed->unread(c1);
	return 1;
	}

	int Token::read_quoted(int quote, StringBuilder *s, PushbackReader *in_Renamed) throw(IOException)
	{
	int rc;
	int c1;
	for (;;)
	{
		c1 = in_Renamed->read();
		if (c1 == -1 || c1 == '\n')
		{
		in_Renamed->unread(c1);
		return -2;
		}
		else if (c1 == quote)
		{
		c1 = in_Renamed->read();
		if (c1 != quote)
		{
			in_Renamed->unread(c1);
			return 1;
		}
		c1 = quote;
		}
		else if (c1 == '\\')
		{
		rc = escapeSequences(c1, s, in_Renamed);
		if (rc > 0)
		{
			continue;
		}
		else
		{
			return -2;
		}
		}
		s->append(static_cast<char>(c1));
	}
	}

	int Token::escapeSequences(int backslash, StringBuilder *s, PushbackReader *in_Renamed) throw(IOException)
	{
	int c;
	c = in_Renamed->read();
	switch (c)
	{
	case 'b': // backspace
		s->append(static_cast<char>(8));
		break;
	case 't': // horizontal tab
		s->append(static_cast<char>(9));
		break;
	case 'n': // newline
		s->append(static_cast<char>(10));
		break;
	case 'v': // vertical tab
		s->append(static_cast<char>(11));
		break;
	case 'f': // form feed
		s->append(static_cast<char>(12));
		break;
	case 'r': // carriage return
		s->append(static_cast<char>(13));
		break;
	case 'e': // escape
		s->append(static_cast<char>(27));
		break;
	case 'd': // delete
		s->append(static_cast<char>(127));
		break;
	case 'a': // alarm
		s->append(static_cast<char>(7));
		break;
	default:
		s->append(static_cast<char>(c));
		return 2;
	}
	return 1;
	}

	int Token::read_symbol(int c, StringBuilder *s, PushbackReader *in_Renamed) throw(IOException)
	{
	int c1;
	s->append(static_cast<char>(c));
	//	in.unread(c);
	for (;;)
	{
		c1 = in_Renamed->read();
		if (!isSymbol(c1))
		{
		break;
		}
		s->append(static_cast<char>(c1));
	}
	in_Renamed->unread(c1);
	return 1;
	}

	void Token::write_string(const wstring &s, PrintWriter *out)
	{
	out->print(s);
	}

	void Token::writeq_string(const wstring &s, PrintWriter *out)
	{
	std::vector<char> ch;
	ch = s.toCharArray();
	if ((getStringType(s) == 3))
	{
		out->print("\'");
		for (auto aCh : ch)
		{
			if (aCh == '\'')
			{
				out->print("\\\'");
			}
			else if (aCh == '\\')
			{
				out->print("\\\\");
			}
			else if (aCh == 8) // backspace
			{
				out->print("\\b");
			}
			else if (aCh == 9) // horizontal tab
			{
				out->print("\\t");
			}
			else if (aCh == 10) // newline
			{
				out->print("\\n");
			}
			else if (aCh == 11) // vertical tab
			{
				out->print("\\v");
			}
			else if (aCh == 12) // form feed
			{
				out->print("\\f");
			}
			else if (aCh == 13) // carriage return
			{
				out->print("\\r");
			}
			else if (aCh == 27) // escape
			{
				out->print("\\e");
			}
			else if (aCh == 127) // delete
			{
				out->print("\\d");
			}
			else if (aCh == 7) // alarm
			{
				out->print("\\a");
			}
			else
			{
				out->print(aCh);
			}
		}
		out->print("\'");
	}
	else
	{
		write_string(s, out);
	}
	}

	wstring Token::toQuotedString(const wstring &s)
	{
	   int st = getStringType(s);
		if (st == 0)
		{
			return s;
		}
		if ((st == 3))
		{
			StringBuilder *quoted = new StringBuilder(s.length() * 2);
			//char[] ch = s.toCharArray();
			quoted->append("\'");
			int len = s.length();
			for (int i = 0; i < len; i++)
			{
				char c = s[i];
				if (c == '\'')
				{
					quoted->append("\\\'");
				}
				else if (c == '\\')
				{
					quoted->append("\\\\");
				}
				else if (c == 8) // backspace
				{
					quoted->append("\\b");
				}
				else if (c == 9) // horizontal tab
				{
					quoted->append("\\t");
				}
				else if (c == 10) // newline
				{
					quoted->append("\\n");
				}
				else if (c == 11) // vertical tab
				{
					quoted->append("\\v");
				}
				else if (c == 12) // form feed
				{
					quoted->append("\\f");
				}
				else if (c == 13) // carriage return
				{
					quoted->append("\\r");
				}
				else if (c == 27) // escape
				{
					quoted->append("\\e");
				}
				else if (c == 127) // delete
				{
					quoted->append("\\d");
				}
				else if (c == 7) // alarm
				{
					quoted->append("\\a");
				}
				else
				{
					quoted->append(c);
				}
			}
			quoted->append("\'");
			return quoted->toString();
		}
		else
		{
			return s;
		}
	}

	void Token::toQuotedString(const wstring &s, StringBuilder *quoted)
	{
		if ((getStringType(s) == 3))
		{
			quoted->append("\'");
			int len = s.length();
			for (int i = 0; i < len; i++)
			{
				char c = s[i];
				if (c == '\'')
				{
					quoted->append("\\\'");
				}
				else if (c == '\\')
				{
					quoted->append("\\\\");
				}
				else if (c == 8) // backspace
				{
					quoted->append("\\b");
				}
				else if (c == 9) // horizontal tab
				{
					quoted->append("\\t");
				}
				else if (c == 10) // newline
				{
					quoted->append("\\n");
				}
				else if (c == 11) // vertical tab
				{
					quoted->append("\\v");
				}
				else if (c == 12) // form feed
				{
					quoted->append("\\f");
				}
				else if (c == 13) // carriage return
				{
					quoted->append("\\r");
				}
				else if (c == 27) // escape
				{
					quoted->append("\\e");
				}
				else if (c == 127) // delete
				{
					quoted->append("\\d");
				}
				else if (c == 7) // alarm
				{
					quoted->append("\\a");
				}
				else
				{
					quoted->append(c);
				}
			}
			quoted->append("\'");
		}
		else
		{
			quoted->append(s);
		}
	}

	int Token::getStringType(const wstring &s)
	{
		if (s == "[]" || s == "{}")
		{
			return 0;
		}
		if (s == "" || s == ".")
		{
			return 3;
		}
		if (s == "!" || s == ";")
		{
			return 2;
		}
		char p = s[0];
		int len = s.length();
		if (islower(p))
		{
			for (int i = 1; i < len; i++)
			{
				p = s[i];
				if (!isalnum(p) && p != '_')
				{
					return 3;
				}
			}
			return 0;
		}
		if (isSymbol(s[0]))
		{
			for (int i = 1; i < len; i++)
			{
				p = s[i];
				if (!isSymbol(p))
				{
					return 3;
				}
			}
			return 1;
		}
		return 3;
	}
}
