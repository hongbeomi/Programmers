package level3.가장긴펠린드롬;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

  @Test
  public void solution() {
    String s = "abcbbca";

    Solution sol = new Solution();
    Assert.assertEquals(4, sol.solution(s));
  }

}