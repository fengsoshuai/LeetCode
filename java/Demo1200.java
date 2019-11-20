import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Feng on 2019/11/20 18:05
 * CurrentProject's name is leetcode-demo
 * @author Feng
 */
public class Demo1200 {

    public static void main(String[] args) {
        new Demo1200()
                .minimumAbsDifference(new int[]{3,8,-10,23,19,-4,-14,27})
                .forEach(System.out::println);
    }


    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> resultList = new ArrayList<>();

        // 先排序：升序
        Arrays.parallelSort(arr);
        // 获取最小值
        int min = arr[1] - arr[0];

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] - arr[i - 1] == min){
                resultList.add(Arrays.asList(arr[i - 1], arr[i]));
            } else if(arr[i] - arr[i - 1] < min) {
                resultList.clear();
                resultList.add(Arrays.asList(arr[i - 1], arr[i]));
                min = arr[i] - arr[i - 1];
            }
        }

        return resultList;
    }
}
