package winter_coding_2018.스킬트리;

public class Solution {

    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        int count = 0;

        for (String skillTree : skill_trees) {
            String[] skill_tree = skillTree.split("");
            boolean flag = true;
            for (String s : skill_tree) {
                if (count < skill.indexOf(s)) {
                    flag = false;
                    break;
                } else if (count == skill.indexOf(s)) {
                    count++;
                }
            }
            if (flag) {
                answer++;
            }
            count = 0;
        }
        return answer;
    }

}
