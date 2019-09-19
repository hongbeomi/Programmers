package greedy.단속카메라;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

  @Test
  public void solution() {
    int[][] route = {
        {-20, 15},
        {-14, -5},
        {-18, -13},
        {-5, -3}
    };
    Solution sol = new Solution();
    Assert.assertEquals(2, sol.solution(route));
  }

}