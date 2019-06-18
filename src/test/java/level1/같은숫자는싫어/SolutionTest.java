package level1.같은숫자는싫어;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void solution() {
        int[] arr = { 1,1,3,3,0,1,1 };
        int[] test;
        int[] answer = {1, 3, 0, 1};

        Solution sol = new Solution();
        test = sol.solution(arr);

        Assert.assertThat(answer, CoreMatchers.is(test));
    }
}