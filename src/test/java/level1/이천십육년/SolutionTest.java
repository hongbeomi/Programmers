package level1.이천십육년;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void solution() {
        int a = 5;
        int b = 24;
        String test;
        String answer = "TUE";
        Solution sol = new Solution();
        test = sol.solution(a, b);

        Assert.assertThat(answer, CoreMatchers.is(test));
    }
}