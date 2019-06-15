package kakao_blind_recruitment_2018.오픈채팅방;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String[] status = { "Enter uid1234 Muzi",
                "Enter uid4567 Prodo",
                "Leave uid1234",
                "Enter uid1234 Prodo",
                "Change uid4567 Ryan" };
        Solution sol = new Solution();

        System.out.println(Arrays.toString(sol.solution(status)));
    }

}
