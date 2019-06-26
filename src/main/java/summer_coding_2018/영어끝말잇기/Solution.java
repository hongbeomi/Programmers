package summer_coding_2018.영어끝말잇기;

import java.util.ArrayList;
import java.util.List;

public class Solution {

  public int[] solution(int n, String[] words) {
    int[] answer = new int[2];
    List<String> list = new ArrayList<>();
    int count;
    int human;

    for (int i = 0, j = 1; i < words.length - 1; i++, j++) {
      String end = words[i].substring(words[i].length()-1);
      String start = words[i+1].substring(0,1);
      human = (i+1) % n + 1;
      count = (i+1) / n + 1;

      System.out.println(end + start + "human : " + human);
      if (!end.equals(start) || list.contains(words[i+1])) {
        answer[0] = human;
        answer[1] = count;
        break;
      }
      list.add(words[i]);
    }

    return answer;
  }

}
