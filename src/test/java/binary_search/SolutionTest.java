package binary_search;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

  @Test
  public void solution() {
    int[] budgets = { 120, 110, 140, 150 };
    int M = 485;
    Solution sol = new Solution();

    Assert.assertEquals(127, sol.solution(budgets, M));
  }

}