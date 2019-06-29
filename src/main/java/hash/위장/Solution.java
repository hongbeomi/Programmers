package hash.위장;

import java.util.HashMap;

public class Solution {

  public int solution(String[][] clothes) {
    int answer = 1;
    HashMap<String, Integer> hashMap = new HashMap<>();

    for (String[] clo : clothes) {
      if (hashMap.containsKey(clo[1])) {
        hashMap.replace(clo[1], hashMap.get(clo[1]) + 1);
      } else {
        hashMap.put(clo[1], 1);
      }
    }

    for (int v : hashMap.values()) {
      answer *= (v+1);
    }

    answer -= 1;

    return answer;
  }

}
