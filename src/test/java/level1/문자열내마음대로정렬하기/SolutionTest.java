package level1.문자열내마음대로정렬하기;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void solution() {
        String[] strs = { "sun", "bed", "car" };
        int n = 1;
        String[] test;
        String[] answer = { "car", "bed", "sun" };

        Solution sol = new Solution();
        test = sol.solution(strs, n);

        Assert.assertThat(answer, CoreMatchers.is(test));

    }

    @Test
    public void solution1() {
        String[] strs = { "abce", "abcd", "cdx"};
        int n = 2;
        String[] test;
        String[] answer = { "abcd", "abce", "cdx" };

        Solution sol = new Solution();
        test = sol.solution(strs, n);

        Assert.assertThat(answer, CoreMatchers.is(test));

    }

    @Test
    public void solution2() {
        String[] strs = { "abcd", "abcd"};
        int n = 1;
        String[] test;
        String[] answer = { "abcd", "abcd" };

        Solution sol = new Solution();
        test = sol.solution(strs, n);

        Assert.assertThat(answer, CoreMatchers.is(test));

    }

}