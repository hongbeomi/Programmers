package level1.PandY;

public class Solution {

    boolean solution(String s) {
        String[] str;
        boolean answer = true;
        String p = "P";
        String y = "Y";
        int pCounter = 0;
        int yCounter = 0;

        str = s.split("");

        for (int i = 0; i < str.length; i++) {
            if(str[i].equalsIgnoreCase(p)) {
                pCounter++;
            }
            else if(str[i].equalsIgnoreCase(y)){
                yCounter++;
            }
        }

        if(pCounter != yCounter){
            answer = false;
        }

        return answer;
    }

}
