package level2.스킬트리;

public class Main {

    public static void main(String[] args) {
        String skill = "CBD";
        String[] skillList = { "BACDE", "CBADF", "AECB", "BDA" };

        Solution sol = new Solution();

        System.out.println(sol.solution(skill, skillList));
    }

}
