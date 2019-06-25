package sorting.가장큰수;

import java.util.Arrays;

public class Solution {

  public String solution(int[] numbers) {
    StringBuilder answer = new StringBuilder();
    String[] array = new String[numbers.length];

    for (int i = 0; i < numbers.length; i++) {
      array[i] = String.valueOf(numbers[i]);
    }
    Arrays.sort(array, (s1, s2) -> (s2 + s1).compareTo(s1 + s2));

    if (array[0].equals("0")) {
      return "0";
    }

    for (String s : array) {
      answer.append(s);
    }

    return answer.toString();
  }

}
