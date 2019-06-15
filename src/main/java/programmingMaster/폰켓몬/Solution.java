package programmingMaster.폰켓몬;

import java.util.HashSet;

public class Solution {

    public int solution(int[] nums) {
        int answer = 0;
        HashSet<Integer> set = new HashSet<>();
        int length = nums.length;
        int choiceSize = length/2;

        for (int num : nums) {
            set.add(num);
        }

        answer = set.size();
        if(answer > choiceSize){
            return choiceSize;
        }
        return answer;
    }

}
