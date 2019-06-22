package level2.숫자의표현;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

  @Test
  public void solution() {
    int n = 3;

    Solution sol = new Solution();

    Assert.assertEquals(2, sol.solution(n));
  }
}