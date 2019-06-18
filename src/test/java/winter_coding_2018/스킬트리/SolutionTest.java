package winter_coding_2018.스킬트리;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void solution() {
        String skill = "CBD";
        String[] skillList = { "BACDE", "CBADF", "AECB", "BDA" };
        int test;
        int answer = 2;

        Solution sol = new Solution();
        test = sol.solution(skill, skillList);

        Assert.assertThat(answer, CoreMatchers.is(test));
    }
}