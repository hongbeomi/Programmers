package tipstown_2017.짝지어제거하기;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void solution() {
        String A = "abbabb";
        int test;
        int answer = 1;

        Solution sol = new Solution();
        test = sol.solution(A);

        Assert.assertThat(answer, CoreMatchers.is(test));
    }
}