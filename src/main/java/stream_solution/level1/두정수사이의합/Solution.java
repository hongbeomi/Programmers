package stream_solution.level1.두정수사이의합;

import java.util.stream.LongStream;

public class Solution {

  public long solution(int a, int b) {
    if(a == b){
      return b;
    }
    return LongStream
        .rangeClosed(Math.min(a, b), Math.max(a, b))
        .sum();
  }

}
