package level2.백이십사나라의숫자;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void solution() {
        int n = 4;
        String test;
        String answer = "11";
        Solution sol = new Solution();
        test = sol.solution(n);

        Assert.assertThat(answer, CoreMatchers.is(test));

    }

    @Test
    public void solution1() {
        int n = 3;
        String test;
        String answer = "4";
        Solution sol = new Solution();
        test = sol.solution(n);

        Assert.assertThat(answer, CoreMatchers.is(test));

    }

}