class Solution
{
public:
    int minCostToMoveChips(vector<int>& chips)
    {
        int costs = 0;  //代价
        int numb_odd = 0;    //奇数的数量
        int numb_even = 0;  //偶数的数量
        int i = 0;
        while (i < chips.size())
        {
            if (chips[i] % 2 == 0)
            {
                numb_even++;
            }
            else
            {
                numb_odd++;
            }
            i++;
        }
        if (numb_even > numb_odd)
        {
            return numb_odd;
        }
        else
        {
            return numb_even;
        }
    }
};