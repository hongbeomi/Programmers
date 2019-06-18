package hash.완주하지못한선수;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void solution() {
        String[] participant = { "a", "b", "c", "d" };
        String[] complition = { "a", "b", "c" };
        String test;
        String answer = "d";

        Solution sol = new Solution();
        test = sol.solution(participant, complition);

        Assert.assertThat(answer, CoreMatchers.is(test));
    }
}