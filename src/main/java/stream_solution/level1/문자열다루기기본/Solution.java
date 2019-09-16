package stream_solution.level1.문자열다루기기본;

import java.util.Arrays;

public class Solution {

  public boolean solution(String s){
    return Arrays.stream(s.split(""))
        .allMatch(a -> (s.length() == 4 || s.length() == 6) || a.matches("^[0-9]*$"));
  }

}
