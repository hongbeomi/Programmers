package kakao_blind_recruitment_2017.비밀지도;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

  @Test
  public void solution() {
    int n = 5;
    int[] arr1 = {9, 20, 28, 18, 11};
    int[] arr2 = {30, 1, 21, 17, 28};

    String[] answer = {"#####","# # #", "### #", "#  ##", "#####"};
    Solution sol = new Solution();

    Assert.assertEquals(answer, sol.solution(n, arr1, arr2));
  }

  @Test
  public void solution1() {
    int n = 6;
    int[] arr1 = {46, 33, 33 ,22, 31, 50};
    int[] arr2 = {27 ,56, 19, 14, 14, 10};

    String[] answer = {"######", "###  #", "##  ##", " #### ", " #####", "### # "};
    Solution sol = new Solution();

    Assert.assertEquals(answer, sol.solution(n, arr1, arr2));
  }
}