package greedy.체육복;

import java.util.ArrayList;

class Solution {
        public int solution(int n, int[] lost, int[] reserve) {
            int answer = n - lost.length;
            ArrayList<Integer> lostList = new ArrayList<>();
            ArrayList<Integer> reserveList = new ArrayList<>();

            for (int i : lost) lostList.add(i);
            for (int i : reserve) reserveList.add(i);

            for(int i = 0; i < lostList.size(); i++) {
                for(int j = 0; j < reserveList.size(); j++) {
                    if(lostList.get(i).equals(reserveList.get(j))) {
                        lostList.remove(i);
                        reserveList.remove(j);
                        i--;
                        answer++;
                        break;
                    }
                }
            }

            for (int lostNum : lostList) {
                for (int j = 0; j < reserveList.size(); j++) {
                    int reserveNum = reserveList.get(j);
                    if (lostNum == reserveNum - 1 || lostNum == reserveNum + 1) {
                        reserveList.remove(j);
                        answer++;
                        break;
                    }
                }
            }
            return answer;
        }

}
