/**
 * Created by Feng on 2019/11/15 9:10
 * CurrentProject's name is leetcode-demo
 */
public class Demo1221 {
    // 测试
    public static void main(String[] args) {
        int res = new Demo1221().balancedStringSplit("RLRRLLRLRL");
        System.out.println(res);
    }

    /**
     * 思路：遍历字符串中字符，记录L和R出现的次数，当出现次数相同时，给最终结果+1
     * @param s 目标字符串
     * @return 最终结果
     */
    public int balancedStringSplit(String s) {
        char[] chars = s.toCharArray();

        int res = 0;// 最终结果
        int L = 0;// L出现次数
        int R = 0;// R出现次数
        for (int i = 0; i < chars.length; i++) {

            if(chars[i] == 'L'){
                L ++;
            } else {
                R ++;
            }

            if(L == R){
                res ++;
            }
        }
        return res;
    }
}
