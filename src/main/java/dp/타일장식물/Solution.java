package dp.타일장식물;

public class Solution {

  public long solution(int N) {
    long answer = 2;
    long n1;
    long temp = 4;

    if (N == 1) {
      return 4;
    }

    for (int i = 0; i < N; i++) {
      n1 = answer + temp;
      answer = temp;
      temp = n1;
    }
    return answer;
  }

}
