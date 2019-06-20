package sorting.K번째수;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

  @Test
  public void solution() {
    int[] array = {1, 5, 2, 6, 3, 7, 4};
    int[][] commands = { {2, 5, 3}, {4, 4, 1}, {1, 7, 3} };
    int[] answer = {5, 6, 3};

    Solution sol = new Solution();
    Assert.assertArrayEquals(answer, sol.solution(array, commands));
  }
}