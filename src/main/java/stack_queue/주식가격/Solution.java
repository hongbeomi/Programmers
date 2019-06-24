package stack_queue.주식가격;

import java.util.LinkedList;

public class Solution {

  public int[] solution(int[] prices) { // 시간 복잡도 O(n^2)의 방법
    int[] answer = new int[prices.length];

    for (int i = 0; i < prices.length; i++) {
      int count = 0;

      for (int j = i+1; j < prices.length; j++) {
        count++;

        if (prices[i] > prices[j]) {
          break;
        }
      }
      answer[i] = count;
    }

    return answer;
  }

  public int[] solution_queue(int[] prices) { // 시간 복잡도 O(n)의 방법
    int[] answer = new int[prices.length];
    LinkedList<Integer> queue = new LinkedList<>();
    int count = 0;
    int index = 0;
    int iterator = 1;

    for (int price : prices) {
      queue.addLast(price);
    }

    while (!queue.isEmpty()) {
      if (iterator == prices.length) {
        queue.poll();
        answer[index] = count;
        index++;
        iterator = index + 1;
        count = 0;
      } else if (queue.peek() > prices[iterator]) {
        queue.poll();
        count++;
        answer[index] = count;
        index++;
        iterator = index + 1;
        count = 0;
      } else  {
        iterator++;
        count++;
      }
    }

    return answer;
  }

}