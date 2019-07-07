package level2.가장큰정사각형찾기;

public class Solution {

  public int solution(int [][]board) {
    int answer;
    int height = board.length;
    int width = board[0].length;
    int result = 0;
    int[][] sample = new int[height+1][width+1];

    for(int i = 0; i < height; i++) {
      System.arraycopy(board[i], 0, sample[i + 1], 1, width);
    }

    for(int i = 1; i < height + 1; i++) {
      for(int j = 1; j < width + 1; j++) {
        if(sample[i][j] == 1) {
          sample[i][j] = sample[i][j] + Math.min(sample[i-1][j-1],
              Math.min(sample[i][j-1], sample[i-1][j]));
          result = Math.max(result, sample[i][j]);
        }
      }
    }
    answer = result * result;

    return answer;
  }

}
