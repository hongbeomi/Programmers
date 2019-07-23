package kakao_blind_recruitment_2018.실패율;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void solution() {
      int N = 4;
      int[] stages = {4, 4, 4, 4};
      int[] answer = {4, 1, 2, 3};

      Solution sol = new Solution();
      Assert.assertThat(answer, CoreMatchers.is(sol.solution(N, stages)));
    }

}