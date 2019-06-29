package BP.모의고사;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

  @Test
  public void solution() {
    int[] answers = { 1, 2, 3, 4, 5 };

    Solution sol = new Solution();
    Assert.assertThat(new int[]{1}, CoreMatchers.is(sol.solution(answers)));
  }

  @Test
  public void solution1() {
    int[] answers = { 1, 3, 2, 4, 2 };

    Solution sol = new Solution();
    Assert.assertThat(new int[]{1, 2, 3}, CoreMatchers.is(sol.solution(answers)));
  }

}