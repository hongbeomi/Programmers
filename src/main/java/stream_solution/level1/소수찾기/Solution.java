package stream_solution.level1.소수찾기;

import java.util.stream.IntStream;

public class Solution {

  public int solution(int n) {
    return (int) IntStream.rangeClosed(2, (int) Math.sqrt(n))
        .filter(i -> n % i != 0)
        .count();
  }

}
