package level1.자릿수더하기;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void solution() {
        int n = 123;
        int test;
        int answer = 6;

        Solution sol = new Solution();
        test = sol.solution(n);

        Assert.assertThat(answer, CoreMatchers.is(test));
    }
}