package bfs.타겟넘버;

import java.util.LinkedList;

public class Solution {

  public int solution(int[] numbers, int target) {
    int answer = 0;
    LinkedList<Integer> queue = new LinkedList<>();
    int count = 0;

    queue.add(numbers[0]);
    queue.add(-numbers[0]);

    while(!queue.isEmpty()) {
      if(queue.size() == Math.pow(2, numbers.length)) {
        for (int data : queue) {
          if (data == target) {
            answer++;
          }
        }
        break;
      }

      if(queue.size() >= Math.pow(2, count + 1) ) {
        count++;
      }

      int temp = queue.poll();

      queue.add(temp + numbers[count]);
      queue.add(temp - numbers[count]);
    }

    return answer;
  }

}
