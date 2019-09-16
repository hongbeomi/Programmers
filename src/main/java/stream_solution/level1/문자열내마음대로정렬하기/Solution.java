package stream_solution.level1.문자열내마음대로정렬하기;

import java.util.Arrays;

public class Solution {

  public String[] solution(String[] strings, int n) {
    return  Arrays.stream(strings).parallel()
        .sorted((a, b) -> {
          if (a.charAt(n) > b.charAt(n)) {
            return 1;
          } else if (a.charAt(n) == b.charAt(n)) {
            return a.compareTo(b);
          } else if (a.charAt(n) < b.charAt(n)) {
            return -1;
          }
          return 0;
        })
        .toArray(String[]::new);
  }

}
