package BP.카펫;

public class Solution {

  public int[] solution(int brown, int red) {
    int[] answer = new int[2];
    int a = brown / 2 + 2;
    int b = brown + red;

    int x = (int) (a / 2.f + Math.sqrt((a*a / 4.f - b)));
    int y = a - x;

    if (x > y) {
      answer[0] = x;
      answer[1] = y;
    } else {
      answer[1] = x;
      answer[0] = y;
    }

    return answer;
  }

}
