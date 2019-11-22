
import java.util.Arrays;

/**
 *
 * Created by Feng on 2019/11/22 9:28
 * CurrentProject's name is leetcode-demo
 * 暴力求解：两数之和
 * @author Feng
 */
public class Demo1 {
    public static void main(String[] args) {
        int[] result = new Demo1().twoSum(new int[]{2, 7, 11, 15}, 9);

        System.out.println(Arrays.toString(result));
    }

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if(target == (nums[i] + nums[j])){
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }


}
