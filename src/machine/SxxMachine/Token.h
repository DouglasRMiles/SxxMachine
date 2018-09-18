#pragma once

#include <string>
#include <vector>
#include <limits>
#include <cctype>
#include <stdexcept>
#include "exceptionhelper.h"
#include "stringbuilder.h"

namespace SxxMachine
{

	/**
	 * The <code>Token</code> class contains methods
	 * for character input/output.<br>
	 * <font color="red">This document is under construction.</font>
	 *
	 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
	 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
	 * @version 1.2.5
	 */
	class Token
	{
	public:
		static constexpr int TOKEN_ERROR = -2;
		static constexpr int TOKEN_END_OF_FILE = -1;
		static constexpr int TOKEN_INTEGER = 'I';
		static constexpr int TOKEN_LONG = 'L';
		static constexpr int TOKEN_DOUBLE = 'D';
		static constexpr int TOKEN_ATOM = 'A';
		static constexpr int TOKEN_VARIABLE = 'V';
		static constexpr int TOKEN_STRING = 'S';
		static bool isSolo(int c);
		static bool isSymbol(int c);
		/*
		  public static int read_token(StringBuffer s, PushbackReader in)
		  This method reads one token from the input "in", sets the string,
		  and returns the token type.
		  Type		String
		  -2		"error message"
		  -1		"end_of_file"
		  '.'		"."		full stop
		  ' '		" "		space or comment or unknown chars
		  ','		","
		  '('		"("
		  ')'		")"
		  '['		"["
		  ']'		"]"
		  '{'		"{"
		  '}'		"}"
		  ','		","
		  '|'		"|"
		  'I'		"decimal"	positive integer
		  'L'		"decimal"   positive long
		  'D'		"decimal"	positive double
		  'A'		"atom name"
		  'V'		"variable name"
		  'S'		"string"
		*/
		static int read_token(StringBuilder *s, PushbackReader *in_Renamed) throw(IOException);
		/**
		 *
		 * @param c
		 * @param s
		 * @param in
		 * @return {@link Token#TOKEN_INTEGER} or {@link Token#TOKEN_LONG} or {@link Token#TOKEN_DOUBLE}
		 * @throws IOException
		 */
		static int read_number(int c, StringBuilder *s, PushbackReader *in_Renamed) throw(IOException);
	private:
		static int number_type(StringBuilder *s);
	public:
		static int read_word(int c, StringBuilder *s, PushbackReader *in_Renamed) throw(IOException);
		static int read_quoted(int quote, StringBuilder *s, PushbackReader *in_Renamed) throw(IOException);
		/**
		 * @param backslash  
		 */
		static int escapeSequences(int backslash, StringBuilder *s, PushbackReader *in_Renamed) throw(IOException);

		static int read_symbol(int c, StringBuilder *s, PushbackReader *in_Renamed) throw(IOException);

		/* Write */
		static void write_string(const std::string &s, PrintWriter *out);
		static void writeq_string(const std::string &s, PrintWriter *out);
		static std::string toQuotedString(const std::string &s);
		static void toQuotedString(const std::string &s, StringBuilder *quoted);

		/*
		 * return value:
		 *   0 : if string is a lower case alphnum
		 *   1 : if string is a symbol
		 *   2 : if string is a solo
		 *   3 : others
		 */
		static int getStringType(const std::string &s);
	};

}
