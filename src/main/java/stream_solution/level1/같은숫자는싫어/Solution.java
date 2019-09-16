package stream_solution.level1.같은숫자는싫어;

import java.util.stream.IntStream;

public class Solution {
  private int preNumber = -1;

  public int[] solution(int[] arr) {
    return IntStream.of(arr).filter(i -> {
      if (preNumber != i) {
        preNumber = i;
        return true;
      }
      return false;
    }).toArray();
  }

}
