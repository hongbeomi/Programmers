package stack_queue.다리를지나는트럭;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

  @Test
  public void solution() {
    int bridge_length = 2;
    int weight = 10;
    int[] truck_weights = {7, 4, 5, 6};

    Solution sol = new Solution();
    Assert.assertEquals(8, sol.solution(bridge_length, weight, truck_weights));
  }

}