package stack_queue.프린터;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

  @Test
  public void solution() {
    int[] priorities = {2, 1, 3, 2};
    int location = 2;

    Solution sol = new Solution();
    Assert.assertEquals(1, sol.solution(priorities, location));
  }

  @Test
  public void solution1() {
    int[] priorities = {1, 1, 9, 1, 1, 1};
    int location = 0;

    Solution sol = new Solution();
    Assert.assertEquals(5, sol.solution(priorities, location));
  }

  @Test
  public void solution2() {
    int[] priorities = {};
    int location = 7;

    Solution sol = new Solution();
    Assert.assertEquals(1, sol.solution(priorities, location));
  }

}