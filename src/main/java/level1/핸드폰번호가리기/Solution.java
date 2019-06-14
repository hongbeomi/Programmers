package level1.핸드폰번호가리기;

public class Solution {

    public String solution(String phone_number) {
        String answer = "";
        String[] phone = phone_number.split("");
        for (int i = 0; i < phone.length-4; i++){
            phone[i] = "*";
        }
        for (String s : phone) {
            answer += s;
        }
        return answer;
    }

}
