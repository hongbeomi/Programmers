package level1.자연수뒤집어배열로만들기;

import java.util.ArrayList;

public class Solution {

  public int[] solution(long n) {
    int mok = 1;
    int namerge;
    ArrayList<Integer> arrayList = new ArrayList<>();

    while (mok != 0) {
      namerge = (int) (n % 10);
      mok = (int) (n / 10);
      arrayList.add(namerge);
      n = mok;
    }

    int[] answer = new int[arrayList.size()];

    for (int i = 0; i < arrayList.size(); i++) {
      answer[i] = arrayList.get(i);
    }

    return answer;
  }

}
