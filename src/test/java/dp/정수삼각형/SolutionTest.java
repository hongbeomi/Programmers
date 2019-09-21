package dp.정수삼각형;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

  @Test
  public void solution() {
    int[][] triangle = new int[][] {
        {7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}
    };
    Solution sol = new Solution();
    Assert.assertEquals(30, sol.solution(triangle));
  }

  @Test
  public void solution1() {
    int[][] triangle = new int[][] {
        {7}
    };
    Solution sol = new Solution();
    Assert.assertEquals(7, sol.solution(triangle));
  }
}