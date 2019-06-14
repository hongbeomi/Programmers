package level1.같은숫자는싫어;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = { 1,1,3,3,0,1,1 };

        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.solution(arr)));
    }

}
