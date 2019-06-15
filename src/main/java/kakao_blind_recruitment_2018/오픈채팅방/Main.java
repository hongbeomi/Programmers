package kakao_blind_recruitment_2018.오픈채팅방;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String[] status = { "Enter uid123 Muzi",
                "Enter uid456 Prodo",
                "Leave uid123",
                "Enter uid123 Prodo",
                "Change uid456 Ryan" };
        Solution sol = new Solution();

        System.out.println(Arrays.toString(sol.solution(status)));
    }

}
