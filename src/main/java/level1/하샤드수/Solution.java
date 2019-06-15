package level1.하샤드수;

public class Solution {

    public boolean solution(int x) {
        boolean answer = false;
        int sum = 0;
        int num = x;

        while(num != 0){
            sum += num % 10;
            num /= 10;
        }
        if (x % sum == 0) {
            answer = true;
        }

        return answer;
    }

}
