package bfs.타겟넘버;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

  @Test
  public void solution() {
    int[] numbers = {1, 1, 1, 1, 1};
    int target = 3;

    Solution sol = new Solution();
    Assert.assertEquals(5, sol.solution(numbers, target));
  }
}