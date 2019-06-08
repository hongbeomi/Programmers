package level1.StringDesc;

import java.util.Arrays;
import java.util.Collections;

public class Solution {

    public String solution(String s) {
        String answer = "";
        String[] str = s.split("");
        Arrays.sort(str);
        Collections.reverse(Arrays.asList(str));

        return answer = String.join("",str);
    }

}
