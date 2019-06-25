package sorting.가장큰수;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

  @Test
  public void solution() {
    int[] numbers = {6, 10, 2};

    Solution sol = new Solution();
    Assert.assertEquals("6210", sol.solution(numbers));
  }

  @Test
  public void solution1() {
    int[] numbers = {0, 0, 0};

    Solution sol = new Solution();
    Assert.assertEquals("0", sol.solution(numbers));
  }

}