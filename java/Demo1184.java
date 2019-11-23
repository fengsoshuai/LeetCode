/**
 * Created by Feng on 2019/11/23 11:18
 * CurrentProject's name is leetcode-demo
 * @author Feng
 */
public class Demo1184 {
    public static void main(String[] args) {
        int result = new Demo1184().distanceBetweenBusStops(new int[]{1, 2, 3, 4}, 0, 3);
        System.out.println(result);
    }

    public int distanceBetweenBusStops(int[] distance, int start, int destination) {

        int all = 0;
        int first = 0;
        // 环的长度
        for (int i : distance) {
            all += i;
        }

        // 确保start小
        if(start > destination){
            int temp = start;
            start = destination;
            destination = temp;
        }

        // first路线
        for (int i = start; i < destination; i++) {
            first += distance[i];
        }

        // 取较小
        return Math.min(first, all - first);
    }
}
