package level1.자연수뒤집어배열로만들기;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

  @Test
  public void solution() {
    long n = 12345;
    int[] answer = {5, 4, 3, 2, 1};

    Solution sol = new Solution();

    Assert.assertArrayEquals(answer, sol.solution(n));

  }

}