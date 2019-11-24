class Solution {
public:
	string dayOfTheWeek(int d, int m, int y) {
		//²ÌÀÕ¹«Ê½
		vector<int>benchmark = { 0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4 };
		vector<string>week = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
		y -= m < 3;
		return week[(y + y / 4 - y / 100 + y / 400 + benchmark[m - 1] + d) % 7];
	}
};