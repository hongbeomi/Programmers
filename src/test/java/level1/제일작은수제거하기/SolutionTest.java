package level1.제일작은수제거하기;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void solution() {

        int[] arr = {1, 2, 3};
        int[] test;
        int[] answer = {2, 3};
        Solution sol = new Solution();

        test = sol.solution(arr);

        Assert.assertThat(answer, CoreMatchers.is(test));
    }

    @Test
    public void solution1() {

        int[] arr = {1};
        int[] test;
        int[] answer = {-1};
        Solution sol = new Solution();

        test = sol.solution(arr);

        Assert.assertThat(answer, CoreMatchers.is(test));
    }

}