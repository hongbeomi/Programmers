package level2.최솟값만들기;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {

  public int solution(int []A, int []B){
    int answer = 0;
    ArrayList<Integer> a = new ArrayList<>();
    ArrayList<Integer> b = new ArrayList<>();

    for (int i = 0; i < A.length; i++) {
      a.add(A[i]);
      b.add(B[i]);
    }

    Collections.sort(a);
    Collections.sort(b);
    Collections.reverse(b);

    for (int i = 0; i < A.length; i++) {
      answer += (a.get(i) * b.get(i));
    }
    return answer;
  }

}
