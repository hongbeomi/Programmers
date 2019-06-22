package level2.최솟값만들기;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

  @Test
  public void solution() {
    int[] A = {1, 4, 2};
    int[] B = {5, 4, 4};

    Solution sol = new Solution();

    Assert.assertEquals(29, sol.solution(A, B));
  }

}
