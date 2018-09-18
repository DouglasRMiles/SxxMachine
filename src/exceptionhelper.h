#ifndef EXCEPTIONHELPER
#define EXCEPTIONHELPER

#include <exception>

class InterruptedException : public std::exception
{
private:
    std::string msg;

public:
    InterruptedException(const std::string& message = "") : msg(message)
    {
    }

    const char * what() const throw()
    {
        return msg.c_str();
    }
};

class IOException : public std::exception
{
private:
    std::string msg;

public:
    IOException(const std::string& message = "") : msg(message)
    {
    }

    const char * what() const throw()
    {
        return msg.c_str();
    }
};

class ClassNotFoundException : public std::exception
{
private:
    std::string msg;

public:
    ClassNotFoundException(const std::string& message = "") : msg(message)
    {
    }

    const char * what() const throw()
    {
        return msg.c_str();
    }
};

class InstantiationException : public std::exception
{
private:
    std::string msg;

public:
    InstantiationException(const std::string& message = "") : msg(message)
    {
    }

    const char * what() const throw()
    {
        return msg.c_str();
    }
};

class IllegalAccessException : public std::exception
{
private:
    std::string msg;

public:
    IllegalAccessException(const std::string& message = "") : msg(message)
    {
    }

    const char * what() const throw()
    {
        return msg.c_str();
    }
};

class SecurityException : public std::exception
{
private:
    std::string msg;

public:
    SecurityException(const std::string& message = "") : msg(message)
    {
    }

    const char * what() const throw()
    {
        return msg.c_str();
    }
};

class NoSuchMethodException : public std::exception
{
private:
    std::string msg;

public:
    NoSuchMethodException(const std::string& message = "") : msg(message)
    {
    }

    const char * what() const throw()
    {
        return msg.c_str();
    }
};

class InvocationTargetException : public std::exception
{
private:
    std::string msg;

public:
    InvocationTargetException(const std::string& message = "") : msg(message)
    {
    }

    const char * what() const throw()
    {
        return msg.c_str();
    }
};

class NullPointerException : public std::exception
{
private:
    std::string msg;

public:
    NullPointerException(const std::string& message = "") : msg(message)
    {
    }

    const char * what() const throw()
    {
        return msg.c_str();
    }
};

class NoSuchFieldException : public std::exception
{
private:
    std::string msg;

public:
    NoSuchFieldException(const std::string& message = "") : msg(message)
    {
    }

    const char * what() const throw()
    {
        return msg.c_str();
    }
};

class ClassCastException : public std::exception
{
private:
    std::string msg;

public:
    ClassCastException(const std::string& message = "") : msg(message)
    {
    }

    const char * what() const throw()
    {
        return msg.c_str();
    }
};

class IllegalMonitorStateException : public std::exception
{
private:
    std::string msg;

public:
    IllegalMonitorStateException(const std::string& message = "") : msg(message)
    {
    }

    const char * what() const throw()
    {
        return msg.c_str();
    }
};

class NumberFormatException : public std::exception
{
private:
    std::string msg;

public:
    NumberFormatException(const std::string& message = "") : msg(message)
    {
    }

    const char * what() const throw()
    {
        return msg.c_str();
    }
};

class NoSuchElementException : public std::exception
{
private:
    std::string msg;

public:
    NoSuchElementException(const std::string& message = "") : msg(message)
    {
    }

    const char * what() const throw()
    {
        return msg.c_str();
    }
};

class IllegalStateException : public std::exception
{
private:
    std::string msg;

public:
    IllegalStateException(const std::string& message = "") : msg(message)
    {
    }

    const char * what() const throw()
    {
        return msg.c_str();
    }
};

class StackOverflowError : public std::exception
{
private:
    std::string msg;

public:
    StackOverflowError(const std::string& message = "") : msg(message)
    {
    }

    const char * what() const throw()
    {
        return msg.c_str();
    }
};

class CloneNotSupportedException : public std::exception
{
private:
    std::string msg;

public:
    CloneNotSupportedException(const std::string& message = "") : msg(message)
    {
    }

    const char * what() const throw()
    {
        return msg.c_str();
    }
};

class MalformedURLException : public std::exception
{
private:
    std::string msg;

public:
    MalformedURLException(const std::string& message = "") : msg(message)
    {
    }

    const char * what() const throw()
    {
        return msg.c_str();
    }
};

class FileNotFoundException : public std::exception
{
private:
    std::string msg;

public:
    FileNotFoundException(const std::string& message = "") : msg(message)
    {
    }

    const char * what() const throw()
    {
        return msg.c_str();
    }
};


#endif	//#ifndef EXCEPTIONHELPER
