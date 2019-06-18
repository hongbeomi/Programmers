package programmingMaster.폰켓몬;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void solution() {
        int[] A = {1, 1, 2, 1, 1, 2};
        int test;
        int answer = 2;

        Solution sol = new Solution();
        test = sol.solution(A);

        Assert.assertThat(answer, CoreMatchers.is(test));
    }

    @Test
    public void solution1() {
        int[] A = { 1, 2, 2};
        int test;
        int answer = 1;

        Solution sol = new Solution();
        test = sol.solution(A);

        Assert.assertThat(answer, CoreMatchers.is(test));
    }

}