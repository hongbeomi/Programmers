package kakao_blind_recruitment_2017.비밀지도;

public class Solution {

  public String[] solution(int n, int[] arr1, int[] arr2) {
    String[] answer = new String[n];
    int[] array = new int[n];

    for (int i = 0; i < n; i++) {
      array[i] = (arr1[i] | arr2[i]);
      answer[i] = Integer.toBinaryString(array[i]);

      while (answer[i].length() < n) {
        answer[i] = "0" + answer[i];
      }

      answer[i] = answer[i]
          .replaceAll("1","#")
          .replaceAll("0"," ");
    }

    return answer;
  }

}
