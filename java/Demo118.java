import java.util.ArrayList;
import java.util.List;

/**
 * Created by Feng on 2019/12/4 18:29
 * CurrentProject's name is leetcode-demo
 * 杨辉三角
 * @author Feng
 */
public class Demo118 {
    public static void main(String[] args) {
        new Demo118().generate(5).forEach(System.out::println);
    }


    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        if(numRows == 0){
            return triangle;
        }

        // 第一行总是1
        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);

        // 循环计算下面的行的内容
        for (int rowNum = 1; rowNum < numRows; rowNum++) {
            List<Integer> row = new ArrayList<>();
            List<Integer> prevRow = triangle.get(rowNum - 1);

            // 每一行的第一个元素都是1
            row.add(1);
            for (int i = 1; i < rowNum; i++) {
                row.add(prevRow.get(i - 1) + prevRow.get(i));
            }

            // 最后一个元素是1
            row.add(1);
            triangle.add(row);
        }

        return triangle;
    }

}
