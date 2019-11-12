#include <iostream>
#include <vector>
using namespace std;
class Solution {
public:
    int oddCells(int n, int m, vector<vector<int>>& indices) {
        vector<vector<int>> matrix(n, vector<int>(m,0));

        int size = indices.size();
       
        for (int i=0; i<size; i++)
        {
            int row = indices[i][0];
            int column = indices[i][1];
            for (int y=0; y<m; y++)
            {
                matrix[row][y] += 1;
            }
            for (int x = 0; x < n; x++)
            {
                matrix[x][column] += 1;
            }
        }
        int sum = 0;
        for (int x=0; x<n; x++)
        {
            for (int y=0; y<m; y++)
            {
                if (matrix[x][y]%2 != 0)
                {
                    sum++;
                }
            }
        }
        return sum;
    }


};