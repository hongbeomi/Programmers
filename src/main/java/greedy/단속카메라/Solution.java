package greedy.단속카메라;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Solution {

  public int solution(int[][] routes) {
    int answer = 0;
    int min = Integer.MIN_VALUE;

    ArrayList<Integer> list = new ArrayList<>();

    Arrays.sort(routes, Comparator.comparingInt(o -> o[1]));
    for (int[] route : routes) {
      if (min < route[0]) {
        min = route[1];
        answer++;
      }
    }
    return answer;
  }

}
