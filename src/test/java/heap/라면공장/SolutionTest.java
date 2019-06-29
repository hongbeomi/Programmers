package heap.라면공장;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

  @Test
  public void solution() {
    int stock = 4;
    int[] dates = { 4, 10, 15 };
    int[] supplies = { 20, 5, 10 };
    int k = 30;

    Solution sol = new Solution();
    Assert.assertEquals(2, sol.solution(stock, dates, supplies, k));
  }

}