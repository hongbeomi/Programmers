package level1.HidePhoneNumber;

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
