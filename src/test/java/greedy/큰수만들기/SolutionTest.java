package greedy.큰수만들기;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

  @Test
  public void solution() {
    String number = "1924";
    int k = 2;

    Solution sol = new Solution();
    Assert.assertEquals("94", sol.solution(number, k));

  }
}