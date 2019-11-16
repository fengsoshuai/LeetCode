#include <string>
#include <stack>
using namespace std;
class Solution
{
public:
    int balancedStringSplit(string s)
    {
        stack<char> a;
        stack<char> b;
        
        int sum = 0;
        for (int i=0; i<s.size(); i++)
        {
            if (s[i] == 'L')
            {
                a.push(s[i]);
            }
            else
            {
                b.push(s[i]);
            }
            if (a.size() == b.size())
            {
                while (!a.empty())
                {
                    a.pop();
                }

                while (!b.empty())
                {
                    b.pop();
                }
                sum++;
            }
        }
        return sum;

    }
};
