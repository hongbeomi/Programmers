package summer_coding_2017.소수만들기;

import static java.lang.Math.sqrt;

public class Solution {

  public int solution(int[] nums) {
    int answer = 0;
    int sum;

    for (int i = 0; i < nums.length; i++) {
      for (int j = i+1; j < nums.length; j++) {
        for (int k = j+1; k < nums.length; k++) {
          sum = nums[i] + nums[j] + nums[k];
          int all = 0;

          for (int l = 2; l <= sqrt(sum); l++) {
            if (sum % l == 0) {
              all ++;
            }
          }
          if (all == 0) {
            answer++;
          }

          sum = 0;
        }
      }
    }

    return answer;
  }

}
