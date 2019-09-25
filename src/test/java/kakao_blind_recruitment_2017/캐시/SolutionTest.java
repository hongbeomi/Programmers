package kakao_blind_recruitment_2017.캐시;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

  @Test
  public void solution() {
    String[] cities = {
        "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "NewYork"
    };
    int cacheSize = 3;

    Solution sol = new Solution();
    Assert.assertEquals(26, sol.solution(cacheSize, cities));
  }

  @Test
  public void solution1() {
    String[] cities = {
        "Jeju", "Pangyo", "Seoul", "NewYork", "LA"
    };
    int cacheSize = 0;

    Solution sol = new Solution();
    Assert.assertEquals(25, sol.solution(cacheSize, cities));
  }

}