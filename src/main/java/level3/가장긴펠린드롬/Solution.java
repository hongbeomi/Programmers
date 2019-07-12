package level3.가장긴펠린드롬;

public class Solution {

  public int solution(String s) {
    int answer = 1;
    int size = s.length();
    int start, end;

    for (int i = 1; i < size; ++i) {
      // 비교할 길이가 짝수 일 경우
      start = i - 1;
      end = i;

      while(start >= 0 && end < size && s.charAt(start) == s.charAt(end)) {
        if (end - start + 1 > answer) {
          answer = end - start + 1;
        }
        --start;
        ++end;
      }

      // 비교할 길이가 홀수일 경우
      start = i - 1;
      end = i + 1;

      while(start >= 0 && end < size && s.charAt(start) == s.charAt(end)) {
        if (end - start + 1 > answer) {
          answer = end - start + 1;
        }
        --start;
        ++end;
      }
    }

    return answer;
  }

}
