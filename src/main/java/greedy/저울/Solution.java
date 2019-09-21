package greedy.저울;

import java.util.Arrays;

public class Solution {

  public int solution(int[] weight) {
    int answer = 1;
    Arrays.sort(weight);

    for (int e : weight) {
      if (answer < e)
        break;
      answer += e;
    }

    return answer;
  }

}
