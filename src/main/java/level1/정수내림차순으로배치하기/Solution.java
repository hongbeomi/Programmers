package level1.정수내림차순으로배치하기;

import java.util.stream.Stream;

public class Solution {

    public long solution(long n) {
        long answer = 0;
        long[] digit;
        String str ="";
        
        digit = Stream.of(String.valueOf(n).split("")).mapToLong(Long::parseLong).toArray();

        for (int i = 0; i < digit.length; i++) {
            for (int j = i+1; j < digit.length; j++) {
                if(digit[i] < digit[j]){
                    long tmp = digit[i];
                    digit[i] = digit[j];
                    digit[j] = tmp;
                }
            }
        }

        for (int i = 0; i < digit.length; i++) {
            str += String.valueOf(digit[i]);
        }

        answer = Long.valueOf(str);
        return answer;
    }
}
