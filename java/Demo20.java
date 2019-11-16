import java.util.Stack;

/**
 * Created by Feng on 2019/11/16 13:21
 * CurrentProject's name is leetcode-demo
 * @author Feng
 */
public class Demo20 {
    /***
     * 思路：使用栈，当遇到左括号时入栈，遇到右括号时出栈；
     * 遇到左括号字符('('，''[ , '{')便入栈;
     * 其中'('，''[ , '{'的ASCII码分别为40，91，123
     * 其中')'，']', '}'的ASCII分别是41,93,125
     * @param s
     * @return 循环结束时，若栈为空则返回true（括号有效）
     */
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        int len = s.length();
        // 判空
        if(len < 2 && !"".equals(s.trim())){
            return false;
        }
        for (int i = 0; i < len; i++) {
            char ch = s.charAt(i);
            if ('(' == ch || '[' == ch || '{' == ch) {
                stack.push(ch);
            } else if(')' == ch || ']' == ch || '}' == ch){
                if(stack.isEmpty()){
                    return false;
                }
                char top = stack.peek();
                if(top != (ch - 1) && top != (ch - 2)){
                    return false;
                } else {
                    stack.pop();
                }
            }
        }
        return stack.empty();
    }


    public static void main(String[] args) {
        System.out.println(new Demo20().isValid("()"));
    }
}
