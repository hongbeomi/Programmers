package greedy.섬연결하기;

import java.util.Arrays;

public class Solution {

  public int solution(int n, int[][] costs) {
    int answer = 0;
    boolean[] visit = new boolean[n];
    boolean[] check = new boolean[costs.length];

    Arrays.sort(costs, (a1, a2) -> {
      final Integer n1 = a1[2];
      final Integer n2 = a2[2];
      return n1.compareTo(n2);
    });

    visit[costs[0][0]] = true;
    visit[costs[0][1]] = true;
    check[0] = true;
    answer += costs[0][2];
    int cost = 2;

    while (cost < n) {
      for (int i = 1; i < check.length; i++) {
        if (!check[i] && ((visit[costs[i][0]] && !visit[costs[i][1]]) || (visit[costs[i][1]] && !visit[costs[i][0]]))) {
          check[i] = true;
          visit[costs[i][0]] = true;
          visit[costs[i][1]] = true;
          cost++;
          answer += costs[i][2];
          break;
        }
      }
    }

    return answer;
  }

}
