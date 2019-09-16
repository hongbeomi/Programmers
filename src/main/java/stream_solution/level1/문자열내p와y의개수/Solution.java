package stream_solution.level1.문자열내p와y의개수;

import java.util.Arrays;
import java.util.stream.Stream;

public class Solution {

  boolean solution(String s) {
    long countP =  Stream.of(s)
        .map(a -> s.split(""))
        .flatMap(Arrays::stream)
        .filter(a -> a.equalsIgnoreCase("p"))
        .count();

    long countY = Stream.of(s)
        .map(b -> s.split(""))
        .flatMap(Arrays::stream)
        .filter(b -> b.equalsIgnoreCase("y"))
        .count();

    return countP == countY;
  }

}
