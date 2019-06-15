package tipstown_2017.짝지어제거하기;

import java.util.Stack;

public class Solution {

    public int solution(String s) {
        int answer = 0;
        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray())
            if(!stack.isEmpty() && stack.peek() == c) stack.pop();
            else stack.push(c);

        answer  = stack.isEmpty() ? 1 : 0;

        return answer;
    }

}
