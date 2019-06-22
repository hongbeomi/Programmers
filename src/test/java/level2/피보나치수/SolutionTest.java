package level2.피보나치수;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

  @Test
  public void solution() {
    int n = 5;

    Solution sol = new Solution();
    Assert.assertEquals(5, sol.solution(n));
  }

}