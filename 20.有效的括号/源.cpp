#include <string>
#include <stack>
using namespace std;

class Solution {
public:
    bool isValid(string s)
    {
        if (s.empty())
        {
            return true;
        }
        int i = 0;
        stack<char> left_sign;
        stack<char> right_sign;
        string left= "([{";
        string right= ")]}";
        while (i < s.size())
        {
            if (s[i] == '(' || s[i] == '[' || s[i] == '{')
            {
                left_sign.push(s[i]);
            }
            else
            {
                right_sign.push(s[i]);
            }

            if (!left_sign.empty() && !right_sign.empty())
            {
                if (left.find(left_sign.top()) == right.find(right_sign.top()))
                {
                    left_sign.pop();
                    right_sign.pop();
                }
                else
                {
                    return false;
                }
            }
            i++;

        }
        if (left_sign.empty() && right_sign.empty())
        {
            return true;
        }
        return false;
    }
};

int main()
{
    Solution s;
    s.isValid("([)]");
}