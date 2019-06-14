package level1.소수찾기;

public class Solution {

    int solution(int n) {
        int answer = 0;
        boolean check;
        
        for(int i = 2 ; i <= n ; i++){
            check = true;
            for (int j = 2; j <= (int)Math.sqrt(i); j++) {
                if(i%j == 0){
                    check = false;
                    break;
                }
            }
            if(check){
                answer++;
            }
        }
        return answer;
    }
    
}
