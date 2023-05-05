package Singha.Matrix;

import java.util.Scanner;

public class Matrix2 {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);

        int[][] num = new int[4][5];
        int k = 0;

        // Assing the value.
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                num[i][j] = k;
                k++;
            }
        }

        // printing the value.
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("\t" + num[i][j]);
            }
            System.out.println("\n");
        }
    ob.close();
    }
}
