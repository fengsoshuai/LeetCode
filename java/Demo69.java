/**
 * Created by Feng on 2019/12/3 17:22
 * CurrentProject's name is leetcode-demo
 * @author Feng
 */
public class Demo69 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.println("i = " + i + "," + new Demo69().mySqrt1(i));
        }

    }


    /**
     * 牛顿迭代
     * @param x
     * @return
     */
    public int mySqrt(int x) {
        long a = x;
        while(a * a > x){
            a = (a + x / a) / 2;
        }
        return (int)a;
    }


    /**
     * 超时：或者直接把int的最大值作为上限，反向遍历
     * @param num
     * @return
     */
    public int mySqrt1(int num){
        if(num == 1){
            return 1;
        }
        long x = num / 2;

        while(x * x > num){
            x --;
        }
        return (int)x;
    }
}
