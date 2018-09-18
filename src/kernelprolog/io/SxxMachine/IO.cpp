using namespace std;

#include "IO.h"
#include "IOPeer.h"
#include "../../main/SxxMachine/Builtins.h"
#include "StringBuilder.h"
#include "BufferedReader.h"

namespace SxxMachine
{

IOPeer* IO::peer = nullptr;
bool IO::showOutput = true;
bool IO::showErrors = true;
int IO::showTrace = 0;
long long IO::maxAnswers = 0;
java::io::Reader* const  IO::input = toReader(System::in);
java::io::Writer* IO::output = toWriter(System::out);
java::io::Writer* IO::error = toWriter(System::err);

	Reader* IO::toReader(InputStream* f)
	{
		InputStreamReader tempVar(f);
		return new BufferedReader(&tempVar);
	}

	Reader* IO::toFileReader(const wstring& fname)
	{
		return url_or_file(fname);
	}

	Writer* IO::toWriter(OutputStream* f)
	{
		OutputStreamWriter tempVar(f);
		return new BufferedWriter(&tempVar);
	}

	Writer* IO::toFileWriter(const wstring& s)
	{
		Writer* f = nullptr;
		// mes("HERE"+s);
		try
		{
			FileOutputStream tempVar(s);
			f = toWriter(&tempVar);
		} catch(const IOException& e)
		{
			errmes("write error, to: " + s);
		}
		return f;
	}

	Reader* IO::getStdInput()
	{
		return input;
	}

	Writer* IO::getStdOutput()
	{
		return output;
	}

	Writer* IO::getStdError()
	{
		return error;
	}

	void IO::print(Writer* f, const wstring& s)
	{
		if(!showOutput)
		{
			return;
		}
		if(peer == nullptr)
		{
			try
			{
				f->write(s);
				f->flush();
			} catch(const IOException& e)
			{
				System::err::println("*** error in printing: " + e);
			}
		} else
		{
			peer->print(s);
		}
		return;
	}

	void IO::println(Writer* o, const wstring& s)
	{
		print(o, s + "\n");
	}

	void IO::print(const wstring& s)
	{
		print(getStdOutput(), s);
	}

	void IO::println(const wstring& s)
	{
		println(getStdOutput(), s);
	}

	wstring IO::read_from(Reader* f)
	{
		return readln(f);
	}

	void IO::write_to(Writer* f, const wstring& s)
	{
		println(f, s);
	}

	wstring IO::readLine(Reader* f) throw(IOException)
	{
		StringBuilder* s = new StringBuilder();
		for(int i = 0; i < MAXBUF; i++)
		{
			int c = f->read();
			if(c == '\0' || c == '\n' || c == -1 || (c == '\r' && '\n' == f->read()))
			{
				if(i == 0 && c == -1)
				{
					return "";
				}
				break;
			}
			s->append(c);
		}
		return s->toString();
	}

	wstring IO::readln(Reader* f)
	{
		trace(2, "READLN TRACE: entering");
		wstring s = "";
		try
		{
			if(dynamic_cast<BufferedReader*>(f) != nullptr)
			{
				s = (static_cast<BufferedReader*>(f))->readLine();
			} else
			{
				s = readLine(f);
			}
		} catch(const IOException& e)
		{
			errmes("error in readln: e.toString()");
		}
		trace(2, wstring("READLN TRACE:") + "<" + s + ">");
		return s;
	}

	wstring IO::readln()
	{
		wstring s;
		if(peer == nullptr)
		{
			s = readln(getStdInput());
		} else
		{
			s = peer->readln();
		}
		return s;
	}

	wstring IO::promptln(const wstring& prompt)
	{
		print(prompt);
		return readln();
	}

	void IO::mes(const wstring& s)
	{
		println(getStdOutput(), s);
	}

	void IO::trace(const int& level, const wstring& s)
	{
		if(!showOutput || showTrace < level)
		{
			return;
		}
		if(peer == nullptr)
		{
			println(getStdOutput(), s);
		} else
		{
			peer->traceln(s);
		}
	}

	void IO::trace(const wstring& s)
	{
		if(showTrace >= 1)
		{
			println(getStdOutput(), s);
		}
	}

	void IO::printStackTrace(runtime_error e)
	{
		if(showErrors)
		{
			// ByteArrayOutputStream b=new ByteArrayOutputStream();
			// PrintWriter fb=new PrintWriter(b);
			CharArrayWriter* b = new CharArrayWriter();
			PrintWriter* fb = new PrintWriter(b);
			e.printStackTrace(fb);
//JAVA TO C++ CONVERTER TODO TASK: There is no native C++ equivalent to 'toString':
			IO::errmes(b->toString());
			fb->close();
		}
	}

	void IO::errmes(const wstring& s)
	{
		if(showErrors)
		{
			println(getStdOutput(), s);
		}
	}

	void IO::errmes(const wstring& s, runtime_error e)
	{
		errmes(s);
		printStackTrace(e);
	}

	void IO::assertion(const wstring& Mes)
	{
		IO::errmes("assertion failed", (runtime_error(Mes)));
	}

	int IO::system(const wstring& cmd)
	{
		// IO.mes("executing: <"+cmd+">");
		try
		{
			Runtime::getRuntime().exec(cmd);
		} catch(const IOException& e)
		{
			IO::errmes("error in system cmd: " + cmd, e);
			return 0;
		}
		return 1;
	}

	Reader* IO::url2stream(const wstring& f)
	{
		return url2stream(f, false);
	}

	Reader* IO::url2stream(const wstring& f, const bool& quiet)
	{
		Reader* stream = nullptr;
		try
		{
			URL* url = new URL(f);
			stream = toReader(url->openStream());
		} catch(const MalformedURLException& e)
		{
			if(quiet)
			{
				return nullptr;
			}
			IO::errmes("bad URL: " + f, e);
		} catch(const IOException& e)
		{
			if(quiet)
			{
				return nullptr;
			}
			IO::errmes("unable to read URL: " + f, e);
		}

		return stream;
	}

	wstring IO::getBaseDir()
	{

		return "";

	}

	Reader* IO::url_or_file(const wstring& s)
	{
		Reader* stream = nullptr;
		try
		{

			if(nullptr == stream)
			{
				stream = url2stream(s, true);
			}

			if(nullptr == stream)
			{
				FileInputStream tempVar(s);
				stream = toReader(&tempVar);
			}
		} catch(const IOException& e)
		{
		}
		return stream;
	}

	Reader* IO::string_to_stream(const wstring& s) throw(IOException)
	{
		StringReader* stream = new StringReader(s);
		return stream;
	}

	URL* IO::find_url(const wstring& s)
	{
		wstring valid = "";
		Reader* stream;

		wstring baseDir = getBaseDir();
		valid = baseDir + s;
		stream = url2stream(valid, true);

		if(nullptr == stream)
		{
			valid = s;
			stream = url2stream(valid, true);
		}
		try
		{
			stream->close();
		} catch(const IOException& e)
		{
			valid = "";
		}

		URL* url = nullptr;

		try
		{
			url = new URL(valid);
		} catch(const MalformedURLException& e)
		{
		}

		return url;
	}
}
