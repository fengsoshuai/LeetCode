#include <vector>

using namespace std;

class Solution {
public:
	int distanceBetweenBusStops(vector<int>& distance, int start, int destination)
	{
		int size = distance.size();
		if (start < 0 || start >= size || destination < 0 || destination >= size)
		{
			return -1;
		}
		if (start > destination)
		{
			start = start + destination;
			destination = start - destination;
			start = start - destination;
		}

		int forward = 0;
		int reverse = 0;
		for (int i = start; i < destination; i++)
		{
			forward = forward + distance[i];
		}

		for (int i = start - 1; i >= 0; i--)
		{
			reverse = reverse + distance[i];
		}

		for (int i = destination; i < size; i++)
		{
			reverse = reverse + distance[i];
		}

		return forward > reverse ? reverse : forward;
	}
};