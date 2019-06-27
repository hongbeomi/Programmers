package summer_coding_2018.영어끝말잇기;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

  @Test
  public void solution() {
    String[] word = { "hello", "one", "even", "never", "now", "world", "draw" };
    int n = 2;
    int[] answer = {1, 3};

    Solution sol = new Solution();

    Assert.assertThat(answer , CoreMatchers.is(sol.solution(n, word)));
  }

}