package level1.시저암호;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void solution() {

        String a = "a B z";
        int n = 4;
        String test;
        String answer = "e F d";

        Solution sol = new Solution();
        test = sol.solution(a, n);

        Assert.assertThat(answer, CoreMatchers.is(test));
    }
}