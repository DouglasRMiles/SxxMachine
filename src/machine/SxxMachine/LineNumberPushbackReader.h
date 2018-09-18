#ifndef LINENUMBERPUSHBACKREADER
#define LINENUMBERPUSHBACKREADER

#include <vector>
#include <stdexcept>
#include <mutex>

namespace SxxMachine
{

	class LineNumberPushbackReader : public PushbackReader
	{
		/** The current line number */
	private:
		int lineNumber = 0;
		/** The line number of the mark, if any */
		int markedLineNumber = 0; // Defaults to 0
	public:
		LineNumberPushbackReader(Reader* in_RenamedTODO);
		LineNumberPushbackReader(Reader* in_RenamedTODO, const int& size);
		/**
		 * Set the current line number.
		 *
		 * @param  lineNumber
		 *         An int specifying the line number
		 *
		 * @see #getLineNumber
		 */
		virtual void setLineNumber(const int& lineNumber);
		/**
		 * Get the current line number.
		 *
		 * @return  The current line number
		 *
		 * @see #setLineNumber
		 */
		virtual int getLineNumber();

		/**
		 * Read a single character.  <a href="#lt">Line terminators</a> are
		 * compressed into single newline ('\n') characters.  Whenever a line
		 * terminator is read the current line number is incremented.
		 *
		 * @return  The character read, or -1 if the end of the stream has been
		 *          reached
		 *
		 * @throws  IOException
		 *          If an I/O error occurs
		 */
		int read() throw(IOException) override;
		/**
		 * Read characters into a portion of an array.  Whenever a <a
		 * href="#lt">line terminator</a> is read the current line number is
		 * incremented.
		 *
		 * @param  cbuf
		 *         Destination buffer
		 *
		 * @param  off
		 *         Offset at which to start storing characters
		 *
		 * @param  len
		 *         Maximum number of characters to read
		 *
		 * @return  The number of bytes read, or -1 if the end of the stream has
		 *          already been reached
		 *
		 * @throws  IOException
		 *          If an I/O error occurs
		 */
		int read(std::vector<char&>& cbuf, const int& off, const int& len) throw(IOException) override;
		/** Maximum skip-buffer size */
	private:
		static constexpr int maxSkipBufferSize = 8192;
		/** Skip buffer, null until allocated */
		std::vector<char> skipBuffer;
		/**
		 * Skip characters.
		 *
		 * @param  n
		 *         The number of characters to skip
		 *
		 * @return  The number of characters actually skipped
		 *
		 * @throws  IOException
		 *          If an I/O error occurs
		 *
		 * @throws  IllegalArgumentException
		 *          If <tt>n</tt> is negative
		 */
	public:
		long long skip(long long n) throw(IOException) override;
		/**
		 * Mark the present position in the stream.  Subsequent calls to reset()
		 * will attempt to reposition the stream to this point, and will also reset
		 * the line number appropriately.
		 *
		 * @param  readAheadLimit
		 *         Limit on the number of characters that may be read while still
		 *         preserving the mark.  After reading this many characters,
		 *         attempting to reset the stream may fail.
		 *
		 * @throws  IOException
		 *          If an I/O error occurs
		 */
		void mark(const int& readAheadLimit) throw(IOException) override;
		/**
		 * Reset the stream to the most recent mark.
		 *
		 * @throws  IOException
		 *          If the stream has not been marked, or if the mark has been
		 *          invalidated
		 */
		void reset() throw(IOException) override;
		void unread(const int& c) throw(IOException) override;
		void unread(std::vector<char&>& cbuf, const int& off, const int& len) throw(IOException) override;
	};

}


#endif	//#ifndef LINENUMBERPUSHBACKREADER
