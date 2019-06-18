package level1.짝수와홀수;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void solution() {

        int num = 16;
        String s;
        String answer = "Even";

        Solution sol = new Solution();
        s = sol.solution(num);

        Assert.assertThat(answer, CoreMatchers.is(s));
    }

    @Test
    public void solution1() {
        int num = 7;
        String s;
        String answer = "Odd";

        Solution sol = new Solution();
        s = sol.solution(num);

        Assert.assertThat(answer, CoreMatchers.is(s));
    }
}