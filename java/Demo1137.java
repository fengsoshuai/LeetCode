/**
 * Created by Feng on 2019/11/27 19:59
 * CurrentProject's name is leetcode-demo
 * @author Feng
 */
public class Demo1137 {
    /**
     * 递归：超时
     * @param n
     * @return
     */
    public int tribonacci(int n) {
        if(n <= 0){
            return 0;
        }

        if(n == 1 || n == 2){
            return 1;
        }

        return tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3);
    }


    /***
     * 非递归
     * @param n
     * @return
     */
    public int tribonacci1(int n) {
        if (n==0) {
            return 0;
        }
        int t1 = 0;
        int t2 = 1;
        int t3 = 1;
        for (int i = 4; i <= n + 1; i++) {
            int t4 = t1 + t2 + t3;
            t1 = t2;
            t2 = t3;
            t3 = t4;
        }

        return t3;
    }


    public static void main(String[] args) {
        Demo1137 demo = new Demo1137();
        int res = demo.tribonacci1(4);

        System.out.println(res);
    }
}
