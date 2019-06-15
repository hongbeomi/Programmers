package level1.행렬의덧셈;

public class Main {

    public static void main(String[] args) {
        int[][] A = { {1}, {3} };
        int[][] B = { {2}, {4} };
        int[][] C;

        Solution sol = new Solution();
        C = sol.solution(A, B);

        for (int[] ints : C) {
            System.out.println();
            for (int j = 0; j < C[0].length; j++) {
                System.out.println(ints[j]);
            }
        }
    }

}
