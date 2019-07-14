package level1.콜라츠추측;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

  @Test
  public void solution() {
    int num = 6;

    Solution sol = new Solution();
    Assert.assertEquals(8, sol.solution(num));
  }

  @Test
  public void solution1() {
    int num = 626331;

    Solution sol = new Solution();
    Assert.assertEquals(-1, sol.solution(num));
  }

}