package level2.N개의최소공배수;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

  @Test
  public void solution() {
    int[] arr = {2, 6, 8, 14};

    Solution sol = new Solution();

    Assert.assertEquals(168, sol.solution(arr));
  }

  @Test
  public void solution1() {
    int[] arr = {2};

    Solution sol = new Solution();

    Assert.assertEquals(2, sol.solution(arr));
  }

}
