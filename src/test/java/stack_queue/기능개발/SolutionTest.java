package stack_queue.기능개발;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

  @Test
  public void solution() {
    int[] progresses = {93, 30, 55};
    int[] speeds = {1, 30, 5};
    int[] answer = {2, 1};

    Solution sol = new Solution();
    Assert.assertThat(answer, CoreMatchers.is(sol.solution(progresses, speeds)));
  }

}
