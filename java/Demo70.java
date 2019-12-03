/**
 * Created by Feng on 2019/12/3 18:40
 * CurrentProject's name is leetcode-demo
 * @author Feng
 */
public class Demo70 {
    public static void main(String[] args) {
        int res = new Solution().climbStairs(10);
        System.out.println(res);
    }

    /**
     * 斐波那契
     */
    public static class Solution {
        public int climbStairs(int n) {
            if (n == 1) {
                return 1;
            }
            int first = 1;
            int second = 2;
            for (int i = 3; i <= n; i++) {
                int third = first + second;
                first = second;
                second = third;
            }
            return second;
        }
    }

}
