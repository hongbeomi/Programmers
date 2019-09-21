package dp.정수삼각형;

import java.util.Scanner;

public class Solution {

  public int solution(int[][] triangle) {
    if(triangle.length == 1) {
      return triangle[0][0];
    }

    for (int i = triangle.length - 1; i >= 0; i--) {
      for (int j = 0 ; j < triangle[i].length - 1 ; j++) {
        triangle[i-1][j] = Math.max(triangle[i-1][j] + triangle[i][j],
            triangle[i-1][j] + triangle[i][j+1]);
      }
    }
    return triangle[0][0];
  }

}
