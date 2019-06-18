package level1.문자열을정수로바꾸기;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void solution() {

        String s = "-1234";
        int test;
        int answer = -1234;

        Solution sol = new Solution();
        test = sol.solution(s);

        Assert.assertThat(answer, CoreMatchers.is(test));
    }
}