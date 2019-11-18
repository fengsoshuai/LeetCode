#include <vector>

using namespace std;

class Solution {
public:
	vector<vector<int>> shiftGrid(vector<vector<int>>& grid, int k)
	{
		if (grid.size() == 0 || grid[0].size() == 0 || k==0)
		{
			return grid;
		}
		int n = grid.size();
		int m = grid[0].size();

		vector<vector<int>> res(n, vector<int>(m, 0));
		while (k>0)
		{
			k--;
			for (int i = 0; i < n; i++)
			{
				for (int j = 0; j < m; j++)
				{
					if (j == m-1 && i == n-1)
					{
						res[0][0] = grid[i][j];
						
					}
					else if (j == m-1)
					{
						res[i + 1][0] = grid[i][j];
						
					}
					else
					{
						res[i][j + 1] = grid[i][j];
					}
				}
			}
			grid.clear();
			grid = res;
		}
		
		return res;
	}
};
