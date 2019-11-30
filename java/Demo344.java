import java.util.Arrays;

/**
 * Created by Feng on 2019/11/30 10:29
 * CurrentProject's name is leetcode-demo
 * @author Feng
 */
public class Demo344 {
    public static void main(String[] args) {
        Demo344 demo344 = new Demo344();
        demo344.reverseString(new char[]{'h','e','l','l','o'});
        demo344.reverseString1(new char[]{'h','e','l','l','o'});
    }

    public void reverseString(char[] s) {
        if(s == null || s.length == 0){
            return;
        }

        int len = s.length;
        int two = 2;

        for (int i = 0; i <= len / two; i++) {
            // 当判断为偶数；并且循环到数组中间位置时
            if((i == len / two) && (len & 1) == 0){
                break;
            }
            char temp = s[i];
            s[i] = s[len - i - 1];
            s[len - i - 1] = temp;
        }
        // 打印结果
        System.out.println(Arrays.toString(s));
    }

    /**
     * 双指针
     * @param s
     */
    public void reverseString1(char[] s) {
        if(s == null || s.length == 0){
            return;
        }

        int left = -1;
        int right = s.length;
        while(++left < --right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
        }
    }
}
