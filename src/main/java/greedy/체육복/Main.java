package greedy.체육복;

public class Main {

    public static void main(String[] args) {
        int n = 3;
        int[] lost = { 3 };
        int[] reserve = { 1 };

        Solution sol = new Solution();
        System.out.println(sol.solution(n,lost,reserve));
    }

}
