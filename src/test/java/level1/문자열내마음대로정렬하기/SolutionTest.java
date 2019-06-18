package level1.문자열내마음대로정렬하기;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void solution() {
        String[] strs = { "sun", "bed", "car" };
        int n = 2;
        String[] test;
        String[] answer = { "bed", "sun", "car" };

        Solution sol = new Solution();
        test = sol.solution(strs, n);

        Assert.assertThat(answer, CoreMatchers.is(test));

    }
}