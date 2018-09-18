using namespace std;

#include "LineNumberPushbackReader.h"

namespace SxxMachine
{

	LineNumberPushbackReader::LineNumberPushbackReader(Reader *in_Renamed) : java::io::PushbackReader(in_Renamed)
	{
	}

	LineNumberPushbackReader::LineNumberPushbackReader(Reader *in_Renamed, int size) : java::io::PushbackReader(in_Renamed, size)
	{
	}

	void LineNumberPushbackReader::setLineNumber(int lineNumber)
	{
		this->lineNumber = lineNumber;
	}

	int LineNumberPushbackReader::getLineNumber()
	{
		return this->lineNumber;
	}

	int LineNumberPushbackReader::read() throw(IOException)
	{
		{
			lock_guard<mutex> lock(this->lock);
			int c = PushbackReader::read();
			if (c == '\n')
			{
				this->lineNumber++;
			}
			return c;
		}
	}

	int LineNumberPushbackReader::read(std::vector<char> &cbuf, int off, int len) throw(IOException)
	{
		{
			lock_guard<mutex> lock(this->lock);
			int n = PushbackReader::read(cbuf, off, len);
			for (int i = off; i < off + n; i++)
			{
				if (cbuf[i] == '\n')
				{
					this->lineNumber++;
				}
			}
			return n;
		}
	}

	long long LineNumberPushbackReader::skip(long long n) throw(IOException)
	{
		if (n < 0)
		{
			throw invalid_argument("skip() value is negative");
		}
		int nn = static_cast<int>(min(n, maxSkipBufferSize));
		{
			lock_guard<mutex> lock(this->lock);
			if ((this->skipBuffer.empty()) || (this->skipBuffer.size() < nn))
			{
				this->skipBuffer = std::vector<char>(nn);
			}
			long long r = n;
			while (r > 0)
			{
				int nc = read(this->skipBuffer, 0, static_cast<int>(min(r, nn)));
				if (nc == -1)
				{
					break;
				}
				r -= nc;
			}
			return n - r;
		}
	}

	void LineNumberPushbackReader::mark(int readAheadLimit) throw(IOException)
	{
		{
			lock_guard<mutex> lock(this->lock);
			PushbackReader::mark(readAheadLimit);
			this->markedLineNumber = this->lineNumber;
		}
	}

	void LineNumberPushbackReader::reset() throw(IOException)
	{
		{
			lock_guard<mutex> lock(this->lock);
			PushbackReader::reset();
			this->lineNumber = this->markedLineNumber;
		}
	}

	void LineNumberPushbackReader::unread(int c) throw(IOException)
	{
		PushbackReader::unread(c);
		if (c == '\n')
		{
			this->lineNumber--;
		}
	}

	void LineNumberPushbackReader::unread(std::vector<char> &cbuf, int off, int len) throw(IOException)
	{
		PushbackReader::unread(cbuf, off, len);
		for (int i = off; i < off + len; i++)
		{
			if (cbuf[i] == '\n')
			{
				this->lineNumber--;
			}
		}
	}
}
