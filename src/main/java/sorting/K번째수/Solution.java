package sorting.K번째수;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {

    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int value : array) {
            arrayList.add(value);
        }

        for (int i = 0; i < commands.length; i++) {
            ArrayList<Integer> sample = new ArrayList<>();

            for (int j = (commands[i][0] - 1); j <= (commands[i][1] - 1); j++) {
                sample.add(arrayList.get(j));
            }
            Collections.sort(sample);
            answer[i] = sample.get(commands[i][2]-1);
        }
        return answer;
    }

}

