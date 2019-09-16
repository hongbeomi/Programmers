package stream_solution.level1.x만큼간격이있는n개의숫자;

import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Solution {

  public long[] solution(long x, int n) {
    LongStream answer = Stream.iterate(x, a -> a + x)
        .flatMapToLong(LongStream::of)
        .limit(n);
    return answer.toArray();
  }

}
