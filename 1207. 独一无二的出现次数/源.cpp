#include <map>
#include <set>
#include <vector>
using namespace std;

class Solution
{
public:
    bool uniqueOccurrences(vector<int>& arr)
    {
        std::map<int, int> mp;
        for (int i = 0; i < arr.size(); i++)
        {
            if (mp.find(arr[i]) != mp.end())
            {
                mp[arr[i]]++;
            }
            else
            {
                mp.insert(make_pair(arr[i], 0));
            }
        }

        std::map<int, int> ::iterator it = mp.begin();
        set<int> s;
        int num_loop = 0;
        while (it != mp.end())
        {
            s.insert((*it).second);
            if (s.size() != num_loop + 1)
            {
                return false;
            }
            it++;
            num_loop++;
        }
        return true;
    }
};