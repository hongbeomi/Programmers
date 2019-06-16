package level2.올바른괄호;

import java.util.Stack;

public class Solution {

    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char check = s.charAt(i);
            if (check == '(') {
                stack.push(check);
            } else if (check == ')') {
                if (stack.isEmpty()) {
                    answer = false;
                    break;
                } else {
                    stack.pop();
                }
            }
        }
        if(!stack.isEmpty()) {
            answer = false;
        }

        return answer;
    }

}
