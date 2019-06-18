package level1.문자열다루기기본;

public class Solution {

    boolean solution(String s) {
        boolean answer = true;

        answer = (s.length() == 4 || s.length() == 6) && checkNum(s);

        return answer;
    }

    static boolean checkNum(String s){
        try {
            int number = Integer.parseInt(s);

        }catch (NumberFormatException e){
            return false;
        }
        return true;
    }

}
