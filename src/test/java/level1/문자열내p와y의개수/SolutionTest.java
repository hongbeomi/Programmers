package level1.문자열내p와y의개수;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void solution() {
        String s = "Ppy";
        boolean test;
        boolean answer = false;

        Solution sol = new Solution();
        test = sol.solution(s);

        Assert.assertThat(answer, CoreMatchers.is(test));
    }
}