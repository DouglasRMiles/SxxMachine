#pragma once

//----------------------------------------------------------------------------------------
//	Copyright © 2007 - 2018 Tangible Software Solutions, Inc.
//	This class can be used by anyone provided that the copyright notice remains intact.
//
//	This class is used to replace some Java file and folder method calls
//	with std::filesystem method calls.
//----------------------------------------------------------------------------------------
#include <string>
#include <filesystem>

class FileSystem
{
public:
	static void createDirectory(const std::string &path)
	{
		std::filesystem::create_directory(pathFromString(path));
	}

	static bool pathExists(const std::string &path)
	{
		return std::filesystem::exists(pathFromString(path));
	}

	static bool fileExists(const std::string &path)
	{
		return std::filesystem::is_regular_file(pathFromString(path));
	}

	static bool directoryExists(const std::string &path)
	{
		return std::filesystem::is_directory(pathFromString(path));
	}

	static std::string getFullPath(const std::string &path)
	{
		return std::filesystem::absolute(pathFromString(path)).generic_string();
	}

	static std::string getFileName(const std::string &path)
	{
		return std::filesystem::path(pathFromString(path)).filename().generic_string();
	}

	static std::string getDirectoryName(const std::string &path)
	{
		return std::filesystem::path(pathFromString(path)).parent_path().generic_string();
	}

	static char preferredSeparator()
	{
		return std::filesystem::path::preferred_separator;
	}

private:
	static std::filesystem::path pathFromString(const std::string &path)
	{
		return std::filesystem::path(&path[0]);
	}
};
