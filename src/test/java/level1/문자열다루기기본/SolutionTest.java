package level1.문자열다루기기본;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void solution() {
        String s = "13e3";
        boolean test;
        boolean answer = false;

        Solution sol = new Solution();
        test = sol.solution(s);

        Assert.assertThat(answer, CoreMatchers.is(test));
    }

    @Test
    public void checkNum() {
        String s = "13e3";
        boolean test;
        boolean answer = false;

        test = Solution.checkNum(s);

        Assert.assertThat(answer, CoreMatchers.is(test));
    }

    @Test
    public void checkNumTrue() {
        String s = "133";
        boolean test;
        boolean answer = true;

        test = Solution.checkNum(s);

        Assert.assertThat(answer, CoreMatchers.is(test));
    }

}