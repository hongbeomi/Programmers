package kakao_blind_recruitment_2017.다트게임_1차;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {

  public int solution(String dartResult) {
    int answer = 0;
    String[] sample = dartResult.split("");
    ArrayList<String> list = new ArrayList<>(Arrays.asList(sample));

    for (int i = 0; i < list.size() - 1; i++) {
      String start = list.get(i);
      String end = list.get(i + 1);

      if (start.matches("^[0-9]*$") && end.matches("^[0-9]*$")) {
        // 숫자 추출 정규식 str.matches("^[0-9]*$");
        list.set(i, start + end);
        list.remove(i+1);
      }
    }

    int beforeIndexNum = 0;
    int indexNum = Integer.parseInt(list.get(0));

    for (int i = 1; i < list.size(); i++) {
      switch (list.get(i)) {
        case "S":
          break;
        case "D":
          indexNum = indexNum * indexNum;
          break;
        case "T":
          indexNum = indexNum * indexNum * indexNum;
          break;
        case "*":
          answer += beforeIndexNum;
          indexNum = indexNum * 2;
          break;
        case "#":
          indexNum = -indexNum;
          break;
        default:
          answer += indexNum;
          beforeIndexNum = indexNum;
          indexNum = Integer.parseInt(list.get(i));
          break;
      }
    }
    answer += indexNum;
    return answer;
  }

}
