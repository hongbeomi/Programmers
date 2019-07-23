package kakao_blind_recruitment_2017.다트게임_1차;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

  @Test
  public void solution() {
    String dartResult = "1D#2S*3S";

    Solution sol = new Solution();
    Assert.assertEquals(5, sol.solution(dartResult));
  }

  @Test
  public void solution1() {
    String dartResult = "1D2S#10T";

    Solution sol = new Solution();
    Assert.assertEquals(999, sol.solution(dartResult));
  }

}