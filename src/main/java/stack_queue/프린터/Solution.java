package stack_queue.프린터;

import java.util.Collections;
import java.util.LinkedList;

public class Solution {

  public int solution(int[] priorities, int location) {
    int answer = 1;
    LinkedList<Integer> queue = new LinkedList<>();

    for (int priority : priorities) {
      queue.addLast(priority);
    }

    while (queue.size() > 0) { // 큐가 빌 때까지
      int first = queue.get(0); // 큐의 첫 번째 요소를 가져옴
      int max = Collections.max(queue); // 제일 큰 값을 가져옴

      if (first == max) { // 제일 큰 값이 first와 일치하고
        if (location == 0) { // 현재 위치가 0번째 일 때
          return answer; // 반환
        }
        queue.poll(); // 0번째가 아니라면 큐의 첫번째 요소를 삭제한다. (인쇄)
        answer++; //인쇄시간 +1

      } else {
        queue.addLast(queue.poll()); // 큐의 첫 번째 요소가 max값이 아니라면 맨 앞의 값을 삭제하고 맨 뒤로 추가한다.
      }

      if (location == 0) { // 대기위치가 0이면
        location = queue.size() - 1; // 대기 위치는 큐의 크기 -1
      } else {
        location--; // 0이 아니라면 -1
      }
    }
    return answer;
  }

}
