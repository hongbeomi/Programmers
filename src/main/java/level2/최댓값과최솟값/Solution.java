package level2.최댓값과최솟값;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {

  public String solution(String s) {
    String answer = "";
    ArrayList<Integer> arrayList = new ArrayList<>();

    for (String str: s.split(" ")) {
      arrayList.add(Integer.parseInt(str));
    }

    answer += Collections.min(arrayList) + " " + Collections.max(arrayList);

    return answer;
  }

}
