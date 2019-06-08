package level1.MyRuleSortString;

public class Main {

    public static void main(String[] args) {
        String[] strs = {"sun","bed","car"};
        int n = 1;
        Solution sol = new Solution();

        for (int i = 0; i < strs.length; i++) {
            System.out.println(sol.solution(strs, n)[i]);
        }
    }

}
