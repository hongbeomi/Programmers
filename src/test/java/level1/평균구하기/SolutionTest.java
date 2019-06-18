package level1.평균구하기;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void solution() {

        int[] array = {1, 2, 3, 4, 5};
        double answer = 3.0;
        double s;
        Solution sol = new Solution();
        s = sol.solution(array);

        Assert.assertThat(answer , CoreMatchers.is(s));
    }
}