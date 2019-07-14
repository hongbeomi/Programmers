package level3.멀리뛰기;

public class Solution {

  public long solution(int n) {
    long answer = 0;
    long n1 = 1;
    long n2 = 1;

    if (n == 1) {
      return 1;
    }

    for (int i = 1; i < n; i ++) {
      answer = (n1 + n2) % 1234567;
      n1 = n2 % 1234567;
      n2 = answer % 1234567;
    }

    return answer;
  }

}
