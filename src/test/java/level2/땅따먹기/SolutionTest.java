package level2.땅따먹기;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

  @Test
  public void solution() {
    int[][] land = { {1, 2, 3, 5}, {5, 6, 7, 8}, {4, 3, 2, 1} };

    Solution sol = new Solution();

    Assert.assertEquals(16, sol.solution(land));
  }
}