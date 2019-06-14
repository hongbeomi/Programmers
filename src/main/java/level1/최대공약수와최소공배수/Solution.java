package level1.최대공약수와최소공배수;

public class Solution {

    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int r = 1;
        int max = n;
        int min = m;

        if(n < m){
            max = m;
            min = n;
        }

        while(r > 0) {
            r = max % min;
            max = min;
            min = r;
        }
        answer[0] = max;
        answer[1] = n * m / max;
        return answer;
    }

}
