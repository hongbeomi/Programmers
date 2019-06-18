package level2.백이십사나라의숫자;

public class Solution {

    public String solution(int n) {
        StringBuilder answer = new StringBuilder();

        int[] arr = {4, 1, 2};
        int a;

        while (n > 0) {
            a = n % 3;
            n = n / 3;
            if (a == 0) {
                n -= 1;
            }
            answer.insert(0, arr[a]);
        }
        return answer.toString();

    }

}
