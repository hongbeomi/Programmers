package level1.이상한문자만들기;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void solution() {
        String s = " hello world";
        String test;
        String answer = " HeLlO WoRlD";

        Solution sol = new Solution();
        test = sol.solution(s);

        Assert.assertThat(answer, CoreMatchers.is(test));
    }
}