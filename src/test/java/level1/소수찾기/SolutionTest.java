package level1.소수찾기;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void solution() {
        int n = 5;
        int test;
        int answer = 3;

        Solution sol = new Solution();
        test = sol.solution(n);

        Assert.assertThat(answer, CoreMatchers.is(test));
    }
}