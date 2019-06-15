package level1.예산;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {

    public int solution(int[] d, int budget) {
        int answer = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        int sum  = 0;

        for (int value : d) {
            arrayList.add(value);
        }
        Collections.sort(arrayList);

        for (int i = 0; i < arrayList.size(); i++) {
            sum += arrayList.get(i);
            if (sum > budget) {
                break;
            }
            answer++;
        }

        return answer;
    }

}
