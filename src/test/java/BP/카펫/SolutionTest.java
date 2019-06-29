package BP.카펫;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

  @Test
  public void solution() {
    int brown = 8;
    int red  = 1;

    Solution sol = new Solution();
    Assert.assertThat(new int[]{3, 3}, CoreMatchers.is(sol.solution(brown, red)));

  }

  @Test
  public void solution1() {
    int brown = 10;
    int red  = 2;

    Solution sol = new Solution();
    Assert.assertThat(new int[]{4, 3}, CoreMatchers.is(sol.solution(brown, red)));

  }

}