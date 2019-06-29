package BP.모의고사;

import java.util.ArrayList;

public class Solution {

  public int[] solution(int[] answers) {
    int[] answer = new int[]{ 0, 0, 0 };
    ArrayList<Integer> end = new ArrayList<>();
    int[] a = { 1, 2, 3, 4, 5 };
    int[] b = { 2, 1, 2, 3, 2, 4, 2, 5 };
    int[] c = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };
    int max = 0;

    for (int i = 0; i < answers.length; i++) {
      if (answers[i] == a[i % 5]) {
        answer[0]++;
      }
      if (answers[i] == b[i % 8]) {
        answer[1]++;
      }
      if (answers[i] == c[i % 10]) {
        answer[2]++;
      }
    }

    for ( int ans : answer) {
      if (ans > max) {
        max = ans;
      }
    }

    for (int i = 0; i < 3; i++) {
      if (answer[i] == max) {
        end.add(i+1);
      }
    }

    answer = end.stream().mapToInt(i->i).toArray();

    return answer;
  }

}
