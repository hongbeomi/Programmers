package level3.nx2타일링;

public class Solution {

  public int solution(int n) {
    int answer = 0;
    int n1 = 1;
    int n2 = 1;

    for (int i = 1; i < n ; i++) {
      answer = (n1 + n2) % 1000000007;
      n1 = n2 % 1000000007;
      n2 = answer % 1000000007;
    }

    return answer;
  }

}
