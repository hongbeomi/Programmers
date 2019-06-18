package kakao_blind_recruitment_2018.오픈채팅방;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void solution() {
        String[] status = { "Enter uid1234 Muzi",
                "Enter uid4567 Prodo",
                "Leave uid1234",
                "Enter uid1234 Prodo",
                "Change uid4567 Ryan" };
        String[] test;
        String[] answer = { "Prodo님이 들어왔습니다.",
                "Ryan님이 들어왔습니다.",
                "Prodo님이 나갔습니다.",
                "Prodo님이 들어왔습니다." };

        Solution sol = new Solution();
        test = sol.solution(status);

        Assert.assertThat(answer, CoreMatchers.is(test));

    }
}