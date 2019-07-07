package level2.가장큰정사각형찾기;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

  @Test
  public void solution() {
    int [][]board = { {0, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {0, 0, 1, 0} };

    Solution sol = new Solution();
    Assert.assertEquals(9, sol.solution(board));
  }

}