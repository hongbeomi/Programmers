package graph.방의개수;


import java.util.HashSet;
import java.util.Set;

public class Solution {

  public int solution(int[] arrows) {
    int answer = 0;
    Set<String> lineSet = new HashSet<>();
    Set<String> pointSet = new HashSet<>();
    int x = 0;
    int y = 0;

    pointSet.add("(" + x + "," + y + ")");

    for (int arrow : arrows) {
      for (int j = 0; j < 2; j++) { // 변 사이를 가운데로 지나가는 경우를 계산하기 위해 2번 반복
        String start = "(" + x + "," + y + ")";

        if (arrow <= 1 || arrow == 7) { y++; }
        if (1 <= arrow && arrow <= 3) { x++; }
        if (3 <= arrow && arrow <= 5) { y--; }
        if (5 <= arrow && arrow <= 7) { x--; }

        String point = "(" + x + "," + y + ")";
        String startLine = start + "," + point;
        String backLine = point + "," + start;
        if (pointSet.contains(point)) {
          if (!lineSet.contains(startLine)) {
            answer++;
          }
        }
        pointSet.add(point);
        lineSet.add(startLine);
        lineSet.add(backLine);
      }
    }

    return answer;
  }

}
