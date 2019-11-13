import java.util.LinkedList;
import java.util.List;

/**
 * Created by Feng on 2019/11/13 18:52
 * CurrentProject's name is leetcode-demo
 */
public class Demo1237 {

    public static void main(String[] args) {
        new Demo1237().findSolution((i, j) -> i + j,5)
            .forEach(System.out::println);

        System.out.println("-------------");
        new Demo1237().findSolution((i, j) -> i * j,5)
                .forEach(System.out::println);
    }



    public List<List<Integer>> findSolution(CustomFunction customfunction, int z) {
        List<List<Integer>> result = new LinkedList<>();

        for (int i = 1; i < 1000; i++) {
            for (int j = 1; j < 1000; j++) {
                int value = customfunction.f(i, j);
                if(value == z){
                    List<Integer> temp = new LinkedList<>();
                    temp.add(i);
                    temp.add(j);

                    result.add(temp);
                } else if(value < z) {
                    continue;
                } else {
                    break;
                }
            }
        }

        return result;
    }
}

@FunctionalInterface
interface CustomFunction{
    int f(int i, int j);
}
