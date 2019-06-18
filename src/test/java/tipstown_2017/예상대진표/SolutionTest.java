package tipstown_2017.예상대진표;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void solution() {
        int a = 4, b = 6, c = 8;
        int test;
        int answer = 3;

        Solution sol = new Solution();
        test = sol.solution(c, a, b);

        Assert.assertThat(answer, CoreMatchers.is(test));
    }
}