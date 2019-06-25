package summer_coding_2017.점프와순간이동;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

  @Test
  public void solution() {
    int n = 5000;

    Solution sol = new Solution();
    Assert.assertEquals(5, sol.solution(n));
  }

}