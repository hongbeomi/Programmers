package binary_search;

import java.util.Arrays;

public class Solution {

  public int solution(int[] budgets, int M) {
    int answer = 0;
    Arrays.sort(budgets);

    for (int i = 0; i < budgets.length; i++) {
      if (M / (budgets.length - i) < budgets[i]) {
        answer = M / (budgets.length - i);
        break;
      }
      M = M - budgets[i];
      answer = budgets[i];
    }

    return answer;
  }

}
