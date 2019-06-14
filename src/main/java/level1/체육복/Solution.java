package level1.체육복;

import java.util.Arrays;

class Solution {

    int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;

        int[] lostStudent = new int[n+1];
        int[] reserveStudent = new int[n+1];

        Arrays.fill(lostStudent,0);
        Arrays.fill(reserveStudent,0);
        for (int i : lost) lostStudent[i] = 1;
        for (int i : reserve) reserveStudent[i] = 1;

        for ( int i = 1 ; i <= n ; i++){
            if(lostStudent[i] == 0) answer++;
            else{
                if(i == 1){
                    if(reserveStudent[1] == 1){
                        reserveStudent[1]--;
                        answer++;
                    }
                    else if(reserveStudent[2] == 1){
                        if(lostStudent[2]==0){
                            reserveStudent[2]--;
                            answer++;
                        }
                    }
                }

                else if (i == n){
                    if(reserveStudent[n] == 1){
                        reserveStudent[n]--;
                        answer++;
                    }
                    else if(reserveStudent[n-1] == 1){
                        if(lostStudent[n-1] == 0){
                            reserveStudent[n-1]--;
                            answer++;
                        }
                    }
                }

                else {
                    if(reserveStudent[i] == 1){
                        reserveStudent[i]--;
                        answer++;
                    }
                    else if(reserveStudent[i-1] == 1){
                        reserveStudent[i-1]--;
                        answer++;
                    }
                    else if(reserveStudent[i+1] == 1){
                        if(lostStudent[i+1] == 0){
                            reserveStudent[i+1]--;
                            answer++;
                        }
                    }
                }

            }
        }

        return answer;
    }

}
