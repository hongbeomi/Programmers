package summer_coding_2018.예산;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void solution() {
        int[] d = { 1, 3, 2, 5, 4 };
        int budget = 9;
        int test;
        int answer = 3;

        Solution sol = new Solution();
        test = sol.solution(d, budget);

        Assert.assertThat(answer, CoreMatchers.is(test));

    }
}