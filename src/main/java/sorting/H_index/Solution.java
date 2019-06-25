package sorting.H_index;

import java.util.*;

public class Solution {

  public int solution(int[] citations) {
    int answer = 0;
    ArrayList<Integer> arrayList = new ArrayList<>();

    for (int c : citations) {
      arrayList.add(c);
    }

    arrayList.sort(Collections.reverseOrder());

    while (answer < arrayList.size()) {
      if (arrayList.get(answer) <= answer)
        break;
      answer++;

    }

    return answer;
  }

}
