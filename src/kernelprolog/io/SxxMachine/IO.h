#pragma once

#include <string>
#include <stdexcept>
#include "exceptionhelper.h"
#include "stringbuilder.h"

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine
{
	class IOPeer;
	class system;
}

namespace SxxMachine
{

	/*
	* Copyright (C) Paul Tarau 1996-1999
	*/


	class IO
	{

	public:
		static IOPeer *peer;

		static bool showOutput;

		static bool showErrors;

		static int showTrace;

		static long long maxAnswers; // 0 means all, >0 means ask

		static Reader *const input;

		static Writer *output;

		static Writer *error;

		static Reader *toReader(InputStream *f);

		static Reader *toFileReader(const std::string &fname);

		static Writer *toWriter(OutputStream *f);

		static Writer *toFileWriter(const std::string &s);

		static Reader *getStdInput();

		static Writer *getStdOutput();
		static Writer *getStdError();

		// synchronized
		static void print(Writer *f, const std::string &s);

		static void println(Writer *o, const std::string &s);

		static void print(const std::string &s);

		static void println(const std::string &s);

		// for now just stubs: usable if IO comes from elswere i.e. sockets
		static std::string read_from(Reader *f);

		// for now just stubs: usable if IO comes from elswere i.e. sockets
		static void write_to(Writer *f, const std::string &s);

		static const int MAXBUF = 1 << 30;

		static std::string readLine(Reader *f) throw(IOException);

		static std::string readln(Reader *f);

		static std::string readln();

		static std::string promptln(const std::string &prompt);

		static void mes(const std::string &s);

		static void trace(int level, const std::string &s);

		static void trace(const std::string &s);

		static void printStackTrace(std::runtime_error e);

		static void errmes(const std::string &s);

		// synchronized
		static void errmes(const std::string &s, std::runtime_error e);

		static void assertion(const std::string &Mes);

		static int system(const std::string &cmd);

		static Reader *url2stream(const std::string &f);

		static Reader *url2stream(const std::string &f, bool quiet);

		static std::string getBaseDir();

		static Reader *url_or_file(const std::string &s);

		static Reader *string_to_stream(const std::string &s) throw(IOException);

		static URL *find_url(const std::string &s);
	};

}
