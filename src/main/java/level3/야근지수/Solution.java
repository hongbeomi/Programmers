package level3.야근지수;

import java.util.Collections;
import java.util.PriorityQueue;

public class Solution {

  public long solution(int n, int[] works) {
    long answer = 0;
    PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
    // sort를 쓰면 시간초과가 나와서 우선순위 큐 사용

    for (int work : works) {
      queue.add(work);
    }

    for (int i = 0; i < n; i++) {
      if (queue.size() == 0) {
        break;
      }
      int poll = queue.poll();
      poll--;

      if (poll != 0) {
        queue.add(poll);
      }
    }

    while (!queue.isEmpty()) {
      int poll = queue.poll();
      answer += (long) Math.pow(poll, 2);
    }
    return answer;
  }

}
