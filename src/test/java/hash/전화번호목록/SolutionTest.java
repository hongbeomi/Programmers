package hash.전화번호목록;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

  @Test
  public void solution() {
    String[] phone_book = {"119", "97674223", "1195524421"};

    Solution sol = new Solution();

    assertFalse(sol.solution(phone_book));
  }
}