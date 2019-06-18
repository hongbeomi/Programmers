package level1.핸드폰번호가리기;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void solution() {

        String number = "01024503963";
        String answer = "*******3963";
        String s;
        Solution sol = new Solution();
        s = sol.solution(number);
        Assert.assertThat(answer, CoreMatchers.is(s));


    }
}