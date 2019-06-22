package level2.피보나치수;

public class Solution {

  public int solution(int n) {
    int answer;

    int a = 0;
    int b = 1;
    int tmp = 0;

    for (int i = 0; i < n-1; i++) {
      tmp = (a + b) %1234567;
      a = b;
      b = tmp;
    }
    answer = tmp % 1234567;

    return answer;
  }

}
