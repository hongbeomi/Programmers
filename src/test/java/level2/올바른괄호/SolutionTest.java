package level2.올바른괄호;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void solution() {
        String s = "()()()()";
        boolean test;
        boolean answer = true;

        Solution sol = new Solution();
        test = sol.solution(s);

        Assert.assertThat(answer, CoreMatchers.is(test));

    }

    @Test
    public void solution1() {
        String s = "()()()()(";
        boolean test;
        boolean answer = false;

        Solution sol = new Solution();
        test = sol.solution(s);

        Assert.assertThat(answer, CoreMatchers.is(test));

    }

    @Test
    public void solution2() {
        String s = ")";
        boolean test;
        boolean answer = false;

        Solution sol = new Solution();
        test = sol.solution(s);

        Assert.assertThat(answer, CoreMatchers.is(test));

    }

}