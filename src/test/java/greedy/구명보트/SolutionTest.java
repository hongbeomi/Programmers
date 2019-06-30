package greedy.구명보트;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

  @Test
  public void solution() {
    int[] people = { 70, 80, 50, 50 };
    int limit = 100;

    Solution sol = new Solution();
    Assert.assertEquals(3, sol.solution(people, limit));
  }

}