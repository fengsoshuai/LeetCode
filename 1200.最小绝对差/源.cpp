
#include<functional>
#include <algorithm>
#include <vector>

template<typename T>
class greaterr
{
public:
    bool operator()(T v1, T v2)
    {
        return v1 < v2;
    }
};

class Solution {
public:
    std::vector<std::vector<int>> minimumAbsDifference(std::vector<int>& arr)
    {
        std::sort(arr.begin(), arr.end(), greaterr<int>());
        int size = arr.size();
        std::vector<std::vector<int>> ret;
        int mad = INT_MAX;
        for (int i = 0; i < size - 1; i++)
        {
            if (arr[i+1] -  arr[i] < mad)
            {
                ret.clear();
                mad = arr[i + 1] - arr[i];
               
            }  
            if (arr[i + 1] - arr[i] == mad)
            {
                ret.push_back({ arr[i],arr[i + 1] });
            }
            
        }
        return ret;
    }
};

int main()
{

}