package level1.직사각혈별찍기;

public class Solution {

    String[][] main(int a, int b) {
        String[][] str = new String[a][b];

        for (int i = 0 ; i < a ; i ++) {

            for (int j = 0 ; j < b ; j++){
                System.out.print("*");
                str[i][j] = "*";
            }
            System.out.println();
        }
        return str;
    }

}
