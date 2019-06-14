package level1.평균구하기;

public class Solution {

    public double solution(int[] arr) {
        double answer = 0;
        double sum = 0;

        for (int value : arr) {
            sum += value;
        }
        answer = sum / arr.length;
        return answer;
    }

}
