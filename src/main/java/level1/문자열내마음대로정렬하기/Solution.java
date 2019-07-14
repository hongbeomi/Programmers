package level1.문자열내마음대로정렬하기;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {

    public String[] solution(String[] strings, int n) {
        String[] answer = {};

        Arrays.sort(strings, (o1, o2) -> {
            if(o1.charAt(n) > o2.charAt(n)){
                return 1;
            }
            else if(o1.charAt(n) == o2.charAt(n)){
                return o1.compareTo(o2);
            }

            else if(o1.charAt(n) < o2.charAt(n)){
                return -1;
            }
            return 0;
        });

        return answer = strings;
    }

}
