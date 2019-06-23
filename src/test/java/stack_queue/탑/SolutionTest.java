package stack_queue.탑;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

  @Test
  public void solution() {
    int[] heights = {6, 9, 5, 7, 4};
    Solution sol = new Solution();
    int[] answer = {0, 0, 2, 2, 4};

    Assert.assertThat(answer, CoreMatchers.is(sol.solution(heights)));

  }
}