package greedy.큰수만들기;

public class Solution {

  public String solution(String number, int k) {
    String answer;
    int position = 0;
    int index = 0;
    int limit = number.length() - k;
    char[] words = new char[limit];
    char[] str = number.toCharArray();

    while (limit > 0) {
      char c = (char)0x00;

      for (int i = position; i <= number.length() - limit; ++i) {
        if (str[i] > c) {
          c = str[i];
          position = i;
        }
      }
      ++position;
      --limit;
      words[index++] = c;
    }

    answer = new String(words);

    return answer;
  }

}
