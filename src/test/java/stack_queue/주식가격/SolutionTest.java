package stack_queue.주식가격;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

  @Test
  public void solution() {
    int[] prices = {1, 2, 3, 2, 3};
    int[] answer = {4, 3, 1, 1, 0};

    Solution sol = new Solution();
    Assert.assertThat(answer, CoreMatchers.is(sol.solution(prices)));

  }

  @Test
  public void solution1() {



  }

}
