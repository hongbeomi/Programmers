package level1.최대공약수와최소공배수;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void solution() {

        int n = 3;
        int m = 11;
        int[] array;
        Solution sol = new Solution();
        array = sol.solution(n , m);

        int[] answer = { 1 , 33 };

        Assert.assertThat(answer, CoreMatchers.is(array));

    }
}