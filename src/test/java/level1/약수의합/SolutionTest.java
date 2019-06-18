package level1.약수의합;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void solution() {
        int n = 10;
        int test;
        int answer = 18;

        Solution sol = new Solution();
        test = sol.solution(n);

        Assert.assertThat(answer, CoreMatchers.is(test));
    }
}