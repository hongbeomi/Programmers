package greedy.저울;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

  @Test
  public void solution() {
    int[] weight = {3, 1, 6, 2, 7, 30, 1};
    Solution sol = new Solution();
    Assert.assertEquals(21, sol.solution(weight));
  }

}