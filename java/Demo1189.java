/**
 * Created by Feng on 2019/11/22 8:50
 * CurrentProject's name is leetcode-demo
 * @author Feng
 */
public class Demo1189 {

    public static void main(String[] args) {
        int counts = new Demo1189().maxNumberOfBalloons("loonbalxballpoon");
        System.out.println(counts);
    }


    /**
     * 气球：balloon
     * @param text
     * @return
     */
    public int maxNumberOfBalloons(String text) {
        int len = 5;
        // 记录b,a,l,o,n的个数
        int[] numberCounts = new int[len];
        // 气球的个数
        int counts = 0;
        for (int i = 0; i < text.length(); i++) {
            char oneChar = text.charAt(i);
            if(oneChar == 'b'){
                numberCounts[0] ++;
            } else if(oneChar == 'a') {
                numberCounts[1] ++;
            } else if(oneChar == 'l'){
                numberCounts[2] ++;
            } else if(oneChar == 'o'){
                numberCounts[3] ++;
            } else if(oneChar == 'n') {
                numberCounts[4] ++;
            }
        }

        // 去除一倍的l和o
        numberCounts[2] = numberCounts[2] / 2;
        numberCounts[3] = numberCounts[3] / 2;

        while(true){
            for (int i = 0; i < len; i++) {
                if(numberCounts[i] > 0){
                    numberCounts[i] --;
                } else {
                    return counts;
                }
            }
            counts ++;
        }
    }
}
