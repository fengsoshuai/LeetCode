/**
 * Created by Feng on 2019/11/30 11:19
 * CurrentProject's name is leetcode-demo
 * @author Feng
 */
public class Demo58 {

    public static void main(String[] args) {
        Demo58 demo58 = new Demo58();
        int res = demo58.lengthOfLastWord(" a");
        System.out.println(res);
    }


    public int lengthOfLastWord(String s) {
        s = s.trim();
        if(s.length() == 0){
            return 0;
        }
        int index = s.lastIndexOf(' ');

        return s.length() - 1 - index;
    }

    public int lengthOfLastWord1(String s){
        int index = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if(s.charAt(i) != ' '){
                index ++;
                continue;
            }

            if(index > 0){
                return index;
            }
        }
        return index;
    }
}
