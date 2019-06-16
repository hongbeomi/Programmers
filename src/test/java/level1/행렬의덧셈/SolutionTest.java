package level1.행렬의덧셈;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void solution() {
        int[][] A = { {1}, {3} };
        int[][] B = { {2}, {4} };
        int[][] D = {{3}, {7}};
        int[][] C;

        Solution sol = new Solution();
        C = sol.solution(A,B);

        Assert.assertThat(C, CoreMatchers.is(D));
    }
}