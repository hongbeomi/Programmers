package level1.정수내림차순으로배치하기;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void solution() {

        long n = 118372;
        long test;
        long answer = 873211;
        Solution sol = new Solution();
        test = sol.solution(n);

        Assert.assertThat(answer, CoreMatchers.is(test));
    }
}