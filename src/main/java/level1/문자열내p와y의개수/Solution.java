package level1.문자열내p와y의개수;

public class Solution {

    boolean solution(String s) {
        String[] str;
        boolean answer = true;
        String p = "P";
        String y = "Y";
        int pCounter = 0;
        int yCounter = 0;

        str = s.split("");

        for (String value : str) {
            if (value.equalsIgnoreCase(p)) {
                pCounter++;
            } else if (value.equalsIgnoreCase(y)) {
                yCounter++;
            }
        }

        if(pCounter != yCounter){
            answer = false;
        }

        return answer;
    }

}
