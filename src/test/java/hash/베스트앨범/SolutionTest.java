package hash.베스트앨범;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

  @Test
  public void solution() {
    String[] genres = {"classic", "pop", "classic", "classic", "pop"};
    int[] plays = {500, 600, 150, 800, 2500};
    int[] answer = { 4, 1, 3, 0 };

    Solution sol = new Solution();
    Assert.assertThat(answer, CoreMatchers.is(sol.solution(genres, plays)));
  }

  @Test
  public void solution1() {
    String[] genres = {"classic", "pop", "classic", "pop"};
    int[] plays = {500, 600, 150, 500};
    int[] answer = { 1, 3, 0, 2 };

    Solution sol = new Solution();
    Assert.assertThat(answer, CoreMatchers.is(sol.solution(genres, plays)));
  }

}