package level2.최댓값과최솟값;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

  @Test
  public void solution() {
    String s = "-1 -2 -3";
    Solution sol = new Solution();
    String answer = "-3 -1";

    Assert.assertEquals(answer, sol.solution(s));
  }
}