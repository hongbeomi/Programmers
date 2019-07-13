package BP.소수찾기;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

  @Test
  public void solution() {
    String numbers = "17";

    Solution sol = new Solution();
    Assert.assertEquals(3, sol.solution(numbers));
  }

  @Test
  public void solution1() {
    String numbers = "011";

    Solution sol = new Solution();
    Assert.assertEquals(2, sol.solution(numbers));
  }
}