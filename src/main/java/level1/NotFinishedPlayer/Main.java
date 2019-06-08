package level1.NotFinishedPlayer;

public class Main {

    public static void main(String[] args) {
        String[] participant = { "a", "b", "c", "d" };
        String[] complition = { "a", "b", "c" };

        Solution sol = new Solution();
        System.out.println(sol.solution(participant, complition));
    }

}
