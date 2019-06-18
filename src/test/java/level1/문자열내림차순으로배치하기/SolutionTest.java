package level1.문자열내림차순으로배치하기;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void solution() {
        String a = "helloZ";
        String test;
        String answer = "ollheZ";

        Solution sol = new Solution();
        test = sol.solution(a);

        Assert.assertThat(answer, CoreMatchers.is(test));
    }
}