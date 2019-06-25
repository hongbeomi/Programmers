package heap.더맵게;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

  @Test
  public void solution() {
    int[] sco = {1, 2, 3, 9, 10, 12};
    int K = 7;

    Solution sol = new Solution();

    Assert.assertEquals(2, sol.solution(sco, K));
  }
}