package sorting.H_index;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

  @Test
  public void solution() {
    int[] citations = {3, 0, 6, 1, 5};

    Solution sol = new Solution();
    Assert.assertEquals(3, sol.solution(citations));
  }

}