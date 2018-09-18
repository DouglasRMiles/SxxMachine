#pragma once

#include "../../main/SxxMachine/Builtins.h"
#include <string>

namespace SxxMachine
{
	/*
	* Copyright (C) Paul Tarau 1996-1999
	*/

	class IOPeer
	{

	public:
		virtual void print(const std::string &s) = 0;

		virtual void traceln(const std::string &s) = 0;

		virtual void println(const std::string &s) = 0;

		//public abstract boolean addReader(Thread readThread);

		//public abstract String getReadString();
		virtual std::string readln() = 0;

		virtual void halt() = 0;
	};
}
