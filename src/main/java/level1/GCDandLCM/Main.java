package level1.GCDandLCM;

public class Main {

    public static void main(String[] args) {
        int n = 3;
        int m = 11;
        int[] array;
        Solution sol = new Solution();
        array = sol.solution(n , m);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}
