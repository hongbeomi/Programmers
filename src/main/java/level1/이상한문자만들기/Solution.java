package level1.이상한문자만들기;

class Solution {

    public String solution(String s) {
        String answer = "";
        int cnt = 0;
        String[] str = s.split("");

        for(String ss : str) {
            cnt = ss.contains(" ") ? 0 : cnt + 1;
            answer += cnt%2 == 0 ? ss.toLowerCase() : ss.toUpperCase();
        }
        return answer;
    }

}