package level1.x만큼간격이있는n개의숫자;

public class Solution {

    public long[] solution(int x, int n) {
        long[] answer = new long[n];

        for (int i = 0 ; i < n ; i++) {
            answer[i] = (long) x * (i+1);
        }
        return answer;
    }

}
