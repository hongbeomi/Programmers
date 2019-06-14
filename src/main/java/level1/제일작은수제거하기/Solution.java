package level1.제일작은수제거하기;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {

    public int[] solution(int[] arr) {

        ArrayList<Integer> array = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            array.add(arr[i]);
        }

        array.remove(Collections.min(array));
        int[] answer= new int[array.size()];

        if(answer.length == 0){
            return answer = new int[]{-1};
        }
        else {
            for (int i = 0; i < answer.length; i++) {
                answer[i] = array.get(i);
            }
        }
        return answer;
    }

}
