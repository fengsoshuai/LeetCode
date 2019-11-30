#include <string>
using namespace std;
class Solution 
{
public:
	int lengthOfLastWord(string s) 
	{
		std::string::iterator it = s.begin();
		int size = 0;
		int is_the_last = true;
		while (it != s.end())
		{
			if ((*it) == ' ')
			{
				is_the_last = false;
			}
			else
			{
				if (!is_the_last)
				{
					size = 0;
				}
				is_the_last = true;
				size++;
			}
			it++;
		}
		return size;
	}
	
	//第二种解法，第一种太蠢了，既然要找最后一个，为啥不直接从后边往前遍历呢
	int lengthOfLastWord(string s)
	{
		std::string::iterator it = s.end() -1;
		int size = 0;
		int is_the_last = false;
		while (it != s.begin()-1)
		{
			if (*it != ' ')
			{
				is_the_last = true;
				size++;
			}
			else
			{
				if (is_the_last == true)
				{
					break;
				}
			}
			it--;
		}
		return size;
	}
};