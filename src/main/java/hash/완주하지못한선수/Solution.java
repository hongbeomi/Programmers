package hash.완주하지못한선수;
import java.util.HashMap;

class Solution {

    String solution(String[] participant, String[] completion) {
        String answer = "";

        HashMap<String, Integer> partMap = new HashMap<>();

        for (int i = 0; i < participant.length ; i++) {
            if(partMap.containsKey(participant[i])){
                partMap.replace(participant[i], partMap.get(participant[i])+1 );
            }
            else {
                partMap.put(participant[i],1);
            }
        }

        for (int i = 0; i < completion.length ; i++) {
            if(partMap.get(completion[i]) > 1){
                partMap.replace(completion[i], partMap.get(completion[i])-1);
            }
            else {
                partMap.remove(completion[i]);
            }
        }

        for(String str : partMap.keySet()){
            answer = str;
        }

        return answer;
    }

}
