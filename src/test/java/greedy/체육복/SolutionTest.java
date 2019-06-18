package greedy.체육복;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void solution() {
        int n = 3;
        int[] lost = { 3 };
        int[] reserve = { 1 };
        int test;
        int answer = 2;

        Solution sol = new Solution();
        test = sol.solution(n, lost, reserve);

        Assert.assertThat(answer, CoreMatchers.is(test));
    }
}