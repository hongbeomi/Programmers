package level3.야근지수;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

  @Test
  public void solution() {
    int n = 4;
    int[] works = { 4, 3, 3 };

    Solution sol = new Solution();
    Assert.assertEquals(12, sol.solution(n, works));
  }

  @Test
  public void solution1() {
    int n = 3;
    int[] works = { 1, 1 };

    Solution sol = new Solution();
    Assert.assertEquals(0, sol.solution(n, works));
  }

}