package greedy.섬연결하기;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

  @Test
  public void solution() {
    int[][] costs = {
        {0, 1, 1}, {0, 2, 2}, {1, 2, 5}, {1, 3, 1}, {2, 3, 8}
    };
    int n = 4;
    Solution sol = new Solution();
    Assert.assertEquals(4, sol.solution(n, costs));
  }

}