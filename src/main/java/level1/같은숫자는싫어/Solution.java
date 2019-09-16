package level1.같은숫자는싫어;

import java.util.*;

class Solution {

    int[] solution(int []arr) {
        List<Integer> list = new ArrayList<>();
        int temp = -1;

        for (int value : arr) {
            if (temp != value)
                list.add(value);
            temp = value;
        }

        int[] answer = new int[list.size()];

        for(int i = 0; i < list.size() ; i++){
            answer[i] = list.get(i);
        }
        return answer;
    }

}
