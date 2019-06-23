package summer_coding_2017.소수만들기;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

  @Test
  public void solution() {
    int[] nums = {1, 2, 7, 6, 4};

    Solution sol = new Solution();

    Assert.assertEquals(4, sol.solution(nums));


  }
}