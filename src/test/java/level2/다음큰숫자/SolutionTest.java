package level2.다음큰숫자;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

  @Test
  public void solution() {
    int n = 78;
    Solution sol = new Solution();

    Assert.assertEquals(83 , sol.solution(n));

  }
}