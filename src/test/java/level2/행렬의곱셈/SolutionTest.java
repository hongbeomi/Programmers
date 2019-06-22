package level2.행렬의곱셈;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

  @Test
  public void solution() {
    int[][] A = {{1, 2}, {1, 2}};
    int[][] B = {{3, 4}, {3, 4}};
    int[][] answer = {{11}, {11}};

    Solution sol = new Solution();

    Assert.assertThat(answer, CoreMatchers.is(sol.solution(A, B)));
  }
}