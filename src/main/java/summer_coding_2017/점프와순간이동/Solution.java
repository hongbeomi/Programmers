package summer_coding_2017.점프와순간이동;

public class Solution {

  public int solution(int n) {
    int answer = 0;

    while (n!=0) {
      if (n % 2 == 0) {
        n = n / 2;
      } else {
        n = n -1;
        answer++;
      }
    }

    return answer;
  }

}
