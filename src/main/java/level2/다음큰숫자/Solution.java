package level2.다음큰숫자;

public class Solution {

  public int solution(int n) {
    int answer = 0;
    int m = n+1;

    while (Integer.bitCount(n) != Integer.bitCount(m)) {
      m += 1;
    }

    answer = m;
    return answer;
  }

}
