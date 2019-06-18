package level1.x만큼간격이있는n개의숫자;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void solution() {
        int x = 2;
        int n = 6;
        long[] test;
        long[] answer = {2, 4, 6, 8, 10, 12};

        Solution sol = new Solution();
        test = sol.solution(x, n);

        Assert.assertThat(answer, CoreMatchers.is(test));
    }
}