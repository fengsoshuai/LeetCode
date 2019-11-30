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
};