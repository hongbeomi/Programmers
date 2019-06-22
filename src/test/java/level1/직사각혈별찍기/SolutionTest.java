package level1.직사각혈별찍기;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

  @Test
  public void main() {
    int a = 2;
    int b = 3;
    String[][] answer = {
        {"*", "*", "*"},
        {"*", "*", "*"}
    };

    Solution sol = new Solution();

    Assert.assertEquals(answer, sol.main(a, b));
  }
}