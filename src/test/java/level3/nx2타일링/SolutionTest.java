package level3.nx2타일링;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

  @Test
  public void solution() {
    int n = 4;

    Solution sol = new Solution();
    Assert.assertEquals(5, sol.solution(n));
  }

}