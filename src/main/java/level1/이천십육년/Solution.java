package level1.이천십육년;

class Solution {

    String solution(int a, int b){
        String answer = "";
        String[] week = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int index = 0;

        for(int i = 0 ; i < a-1 ; i++) {
            index += month[i];
        }

        index = (index + b-1) % 7;
        answer = week[index];

        return answer;
    }

}
