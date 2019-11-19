import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Feng on 2019/11/19 19:48
 * CurrentProject's name is leetcode-demo
 * @author Feng
 */
public class Demo1207 {

    public static void main(String[] args) {
        boolean uniqueOccurrences = new Demo1207().uniqueOccurrences(new int[]{1,2,2,1,1,3});
        System.out.println(uniqueOccurrences);
    }

    /**
     * 先使用HashMap计数；（k=数字，v=出现次数）
     * 再操作map中的值集合，判断其是否有重复
     * @param arr
     * @return
     */
    public boolean uniqueOccurrences(int[] arr) {
        int len = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>(len * 4 / 3);
        for (int i : arr) {
            if(map.containsKey(i)){
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }

        Collection<Integer> counts = map.values();
        int countsLength = counts.size();
        List<Integer> collectList = counts.stream().distinct().collect(Collectors.toList());
        return countsLength == collectList.size();
    }
}
