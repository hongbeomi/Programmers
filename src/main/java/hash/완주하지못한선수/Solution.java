package hash.완주하지못한선수;
import java.util.HashMap;

class Solution {

    String solution(String[] participant, String[] completion) {
        String answer = "";

        HashMap<String, Integer> partMap = new HashMap<>();

        for (String s : participant) {
            if (partMap.containsKey(s)) {
                partMap.replace(s, partMap.get(s) + 1);
            } else {
                partMap.put(s, 1);
            }
        }

        for (String s : completion) {
            if (partMap.get(s) > 1) {
                partMap.replace(s, partMap.get(s) - 1);
            } else {
                partMap.remove(s);
            }
        }

        for(String str : partMap.keySet()){
            answer = str;
        }

        return answer;
    }

}
