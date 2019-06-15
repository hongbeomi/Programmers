package kakao_blind_recruitment_2018.오픈채팅방;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    public String[] solution(String[] record) {
        Map<String, String> mapOfIdName = new HashMap<>();
        String[] splitString;
        List<String> answer = new ArrayList<>();
        String[] realAnswer = new String[answer.size()];

        for (String s : record) {
            splitString = s.split(" ");
            if (splitString[0].equals("Enter")) {
                mapOfIdName.put(splitString[1], splitString[2]);
                continue;
            }
            if (splitString[0].equals("Change")) {
                mapOfIdName.put(splitString[1], splitString[2]);
                continue;
            }
        }

        for (String s : record) {
            splitString = s.split(" ");
            if (!splitString[0].equals("Change"))
                if (splitString[0].equals("Enter")) {
                    answer.add(mapOfIdName.get(splitString[1]) + "님이 들어왔습니다.");
                } else if (splitString[0].equals("Leave")) {
                    answer.add(mapOfIdName.get(splitString[1]) + "님이 나갔습니다.");
                }
        }
        return answer.toArray(realAnswer);
    }

}
