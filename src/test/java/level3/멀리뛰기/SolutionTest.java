package level3.멀리뛰기;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

  @Test
  public void solution() {
    int n = 1;
    Solution sol = new Solution();

    Assert.assertEquals(1, sol.solution(n));
  }

  @Test
  public void solution1() {
    int n = 4;
    Solution sol = new Solution();

    Assert.assertEquals(5, sol.solution(n));
  }
}