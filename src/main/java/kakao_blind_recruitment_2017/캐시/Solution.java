package kakao_blind_recruitment_2017.캐시;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {

  public int solution(int cacheSize, String[] cities) {
    int answer = 0;
    Deque<String> deque = new ArrayDeque<>(cacheSize);

    if (cacheSize == 0) {
      return cities.length * 5;
    }

    for (int i = 0; i < cities.length; i++) {
      cities[i] = cities[i].toUpperCase();
    }

    for (String city : cities) {
      if (deque.contains(city)) {
        deque.remove(city);
        deque.addFirst(city);
        answer += 1;
      } else {
        if (deque.size() < cacheSize) {
          deque.addFirst(city);
        } else {
          deque.removeLast();
          deque.addFirst(city);
        }
        answer += 5;
      }
    }

    return answer;
  }

}
