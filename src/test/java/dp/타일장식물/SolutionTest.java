package dp.타일장식물;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

  @Test
  public void solution() {
    int N = 5;
    Solution sol = new Solution();

    Assert.assertEquals(26, sol.solution(N));
  }

  @Test
  public void solution1() {
    int N = 6;
    Solution sol = new Solution();

    Assert.assertEquals(42, sol.solution(N));
  }

  @Test
  public void solution2() {
    int N = 1;
    Solution sol = new Solution();

    Assert.assertEquals(4, sol.solution(N));
  }

}