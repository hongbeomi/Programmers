package wintercoding_2018.스킬트리;

public class Main {

    public static void main(String[] args) {
        String skill = "CBD";
        String[] skillList = { "BACDE", "CBADF", "AECB", "BDA" };

        Solution sol = new Solution();

        System.out.print(sol.solution(skill, skillList));
    }

}
