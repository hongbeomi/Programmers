package level2.최솟값만들기;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

  @Test
  public void solution() {
    int[] A = {1, 2};
    int[] B = {3, 4};

    Solution sol = new Solution();

    Assert.assertEquals(10, sol.solution(A, B));
  }

}
