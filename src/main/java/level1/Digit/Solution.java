package level1.Digit;

import java.util.stream.Stream;

public class Solution {

    public int solution(int n) {
        int answer = 0;
        int [] digit = Stream.of(String.valueOf(n).split("")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < digit.length; i++) {
            answer += digit[i];
        }

        return answer;
    }

}
