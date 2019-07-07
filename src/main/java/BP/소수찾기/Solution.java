package BP.소수찾기;

import java.util.TreeSet;

public class Solution {

  private TreeSet<Integer> treeSet = new TreeSet<>();

  public int solution(String numbers) {
    int answer = 0;
    int i;

    recursive("", numbers);

    for (int num : treeSet) {
      for (i = 2; i < num; i++) {
        if (num % i == 0) {
          break;
        }
      }

      if (i == num) {
        answer++;
      }
    }

    return answer;
  }

  private void recursive(String s, String number) {
    if (number.length() == 0) {
      if (!s.equals(""))
        treeSet.add(Integer.parseInt(s));

    } else {

      for (int i = 0; i < number.length(); i++) {
        recursive(s + number.charAt(i), number.substring(0, i) +
            number.substring(i + 1));
      }

      for (int i = 0; i < number.length(); i++) {
        recursive(s, number.substring(0, i) + number.substring(i + 1));
      }
    }
  }

}
