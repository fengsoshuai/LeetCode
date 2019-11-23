import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Feng on 2019/11/23 10:49
 * CurrentProject's name is leetcode-demo
 * @author Feng
 */
public class Demo1185 {
    public static void main(String[] args) {
        String dayOfTheWeek = new Demo1185().dayOfTheWeek(18, 7, 1999);
        System.out.println(dayOfTheWeek);
    }

    public String dayOfTheWeek(int day, int month, int year) {
        List<String> resultList = Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday",
                "Saturday", "Sunday");

        LocalDate date = LocalDate.of(year, month, day);

        int value = date.getDayOfWeek().getValue();
        return resultList.get(value - 1);
    }
}
