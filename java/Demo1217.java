/**
 * Created by Feng on 2019/11/18 13:27
 * CurrentProject's name is leetcode-demo
 *
 * @author Feng
 */
public class Demo1217 {
    /**
     * 移动奇数到奇数位（消耗0）；移动偶数到偶数位（消耗0）
     * 最终可以得到结果，相邻的2个位，这时将其中之一放入另一位
     * 就是求奇数总数和偶数总数的较小的那个。
     * @param chips
     * @return
     */
    public int minCostToMoveChips(int[] chips) {
        int even = 0;
        int odd = 0;
        for(int chip : chips){
            if((chip & 1) == 0){
                even ++;
            } else {
                odd ++;
            }
        }

        return Math.min(even, odd);
    }

    public static void main(String[] args) {
        int res = new Demo1217().minCostToMoveChips(new int[]{1, 2, 3});
        System.out.println(res);
    }
}
