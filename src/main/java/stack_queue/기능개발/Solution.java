package stack_queue.기능개발;

import java.util.Collections;
import java.util.Stack;

public class Solution {

  public int[] solution(int[] progresses, int[] speeds) {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> answerStack = new Stack<>();
    int index;

    for (int i = 0; i < progresses.length; i++) {
      int finishDay = 0;
      while (progresses[i] < 100) {
        progresses[i] += speeds[i];
        finishDay++;
      }
      stack.push(finishDay); // 일이 다 끝날때까지 걸리는 day를 구해서 push
    }

    while (!stack.empty()) { // 스택이 빌때까지
      int num = 0;
      index = Collections.max(stack); // 스택에서 max값을 찾음
      while (stack.search(index) != -1) { // max값이 존재하지 않을 때까지 반복
        stack.pop();
        num++;
      }
      answerStack.push(num);
    }

    int[] answer = new int[answerStack.size()];

    for (int i = 0; i < answer.length; i++) { // answerStack의 값을 answer로 pop
      answer[i] = answerStack.pop();
    }

    return answer;
  }

}