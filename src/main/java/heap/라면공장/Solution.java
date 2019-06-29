package heap.라면공장;

import java.util.Collections;
import java.util.PriorityQueue;

public class Solution {

  public int solution(int stock, int[] dates, int[] supplies, int k) {
    int answer = 0;
    PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder()); // 가장 큰 수가 먼저 나오게 함.
    int count = 0;

    while (stock < k) {
      while (count < dates.length && dates[count] <= stock) {
        queue.offer(supplies[count]);
        count++;
      }
      answer++;
      stock += queue.poll();
    }

    return answer;
  }

}
