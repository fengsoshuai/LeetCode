#include<vector>
using namespace std;
class Solution {
public:
    bool checkStraightLine(vector<vector<int>>& coordinates) {
        if (coordinates.size() == 2)
        {
            return true;
        }
        for (int i = 0, j = 1; i < coordinates.size() - 2, j < coordinates.size() - 1; i++, j++)
        {
            int x1 = coordinates[i][0] - coordinates[j][0];
            int y1 = coordinates[i][1] - coordinates[j][1];

            int x2 = coordinates[j][0] - coordinates[j + 1][0];
            int y2 = coordinates[j][1] - coordinates[j + 1][1];

            if (y1*x2 != y2*x1)
            {
                return false;
            }

        }
        return true;
    }

};