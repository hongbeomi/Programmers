package level2.JadenCase문자열만들기;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

  @Test
  public void solution() {
    String s = "3people unFollowed me";
    String answer = "3people Unfollowed Me";

    Solution sol = new Solution();
    Assert.assertEquals(answer, sol.solution(s));
  }

}
