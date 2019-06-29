package graph.방의개수;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

  @Test
  public void solution() {
    int[] index = { 1, 4, 7, 4 };

    Solution sol = new Solution();
    Assert.assertEquals(3, sol.solution(index));

  }

}