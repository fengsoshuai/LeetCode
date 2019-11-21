
#include <string>
using namespace std;
class Solution 
{
public:
	int maxNumberOfBalloons(string text)
	{
		string ball("balloon");
		string::iterator it = text.begin();
		int sum = 0;
		while (it != text.end())
		{
			int index = -1;
			if ((index = ball.find(*it)) != -1)
			{
				ball.erase(index);
			}		
			if (ball.size() == 0)
			{
				ball.assign("balloon");
				sum++;
			}
			it++;
		}
		return sum;
	
	}
};

int main()
{
	Solution s;
	s.maxNumberOfBalloons("loonbalxballpoon");
}