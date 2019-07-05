package level1.콜라츠추측;

public class Solution {

  public int solution(int num) {
    int answer = 0;
    long number = num;

    while (number != 1) {
      if (number % 2 == 0) {
        number = number / 2;
      } else {
        number = (number * 3) + 1;
      }
      answer++;

      if (answer == 500) {
        answer = -1;
        break;
      }
    }

    return answer;
  }

}
