/**
 * Created by Feng on 2019/11/12 14:10
 * CurrentProject's name is leetcode-demo
 */
public class Demo1252 {

    public int oddCells(int n, int m, int[][] indices) {

        // 记录奇数值单元格的数目
        int counts = 0;
        // 目标数组：行和列
        int[] rows = new int[n];
        int[] cols = new int[m];

        // 给目标数组改值
        for (int i = 0; i < indices.length; i++) {
            rows[indices[i][0]] ++;
            cols[indices[i][1]] ++;
        }

        // 判断奇数则记录
        for (int i = 0; i < rows.length; i++) {
            for (int j = 0; j < cols.length; j++) {
                if(((rows[i] + cols[j]) & 1) == 1){
                    counts ++;
                }
            }
        }

        return counts;
    }

    // 测试
    public static void main(String[] args) {
        int[][] indices = {{0, 1}, {1, 1}};
        int n = 2;
        int m = 3;
        int counts = new Demo1252().oddCells(n, m, indices);
        System.out.println(counts);
    }
}
