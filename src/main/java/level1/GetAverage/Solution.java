package level1.GetAverage;

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
