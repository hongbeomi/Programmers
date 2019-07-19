package kakao_blind_recuitment_2018.실패율;

import java.util.*;

public class Solution {

  public int[] solution(int N, int[] stages) {
    int[] answer = new int[N];
    HashMap<Double, PriorityQueue<Integer>> map = new HashMap<>();

    ArrayList<Integer> answerList = new ArrayList<>();
    int size = stages.length;

    for (int i = 1; i <= N; i++) {
      int count = 0;
      double prob;

      for (int stage : stages) {
        if (stage == i) {
          count++;
        }
      }

      if (count == 0) {
        prob = 0.0;
      } else {
        prob = (double) count / size;
      }
      size -= count;

      if (!map.containsKey(prob)) {
        PriorityQueue<Integer> list = new PriorityQueue<>();
        list.add(i);
        map.put(prob, list);
      } else {
        map.get(prob).add(i);
      }
    }

    map.keySet()
        .stream()
        .sorted(Comparator.reverseOrder())
        .forEach(s -> {
          answerList.addAll(map.get(s));
        });

    for (int i = 0; i < answerList.size(); i++) {
      answer[i] = answerList.get(i);
    }

    return answer;
  }

}
