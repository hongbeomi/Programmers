package level2.N개의최소공배수;

import java.util.Arrays;

public class Solution {

  public int solution(int[] arr) {
    int answer = 0;
    int lcm = 1;
    Arrays.sort(arr);

    if (arr.length == 1) {
      answer = arr[0];
    }
    else {
      for (int i = arr.length - 1; i >= 0 ; i--) {
        int x = lcm;
        int y = arr[i];

        while (y > 0) {
          int tmp = y;
          y = x % y;
          x = tmp;
        }
        lcm = (lcm * arr[i]) / x;
      }
      answer = lcm;
    }

    return answer;
  }

}