package level2.JadenCase문자열만들기;

public class Solution {

  public String solution(String s) {
    StringBuilder answer = new StringBuilder();
    String[] str = s.split("");

    for (int i = 0; i < str.length; i++) {
      if (i == 0 || str[i-1].equals(" ")) {
        answer.append(str[i].toUpperCase());
      } else {
        answer.append(str[i].toLowerCase());
      }
    }

    return answer.toString();
  }

}
