package hash.위장;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

  @Test
  public void solution() {
    String[][] clothes = {
        {"yellow_hat", "headgear"},
        {"blue_sunglasses", "eyewear"},
        {"green_turban", "headgear"}
    };

    Solution sol = new Solution();
    Assert.assertEquals(5, sol.solution(clothes));
  }

}