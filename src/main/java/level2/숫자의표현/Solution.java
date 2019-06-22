package level2.숫자의표현;

public class Solution {

  public int solution(int n) {
    int answer = 0;
    int sum = 0;
    int init = 1;

    for (int i = 0; i < n; i++) {
      for (int j = init; j <= n; j++) {
        sum += j;
        if (sum == n) {
          answer++;
          break;
        }
        if (sum > n) {
          break;
        }
      }
      sum = 0;
      init += 1;
    }
    
    return answer;
  }

}
