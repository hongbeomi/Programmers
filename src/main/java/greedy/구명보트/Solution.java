package greedy.구명보트;

import java.util.*;

public class Solution {

  public int solution(int[] people, int limit) {
    int answer = 0;
    Arrays.sort(people);
    int size = people.length - 1;

    for (int i = 0; i <= size; i++, answer++) {
      while (size > i && people[i] + people[size--] >limit )
        answer++;
    }

    return answer;
  }

}
