package graph.방의개수;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

  @Test
  public void solution() {
    int[] index = { 1, 4, 7, 4 };

    Solution sol = new Solution();
    Assert.assertEquals(2, sol.solution(index));

  }

}