package Singha.Matrix;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {

        Scanner ob = new Scanner(System.in);

        int[][] a = new int[2][3];
        int[][] b = new int[2][3];

        System.out.println("Enter the value for first matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = ob.nextInt();
            }
        }

        System.out.println("Enter the value for second matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                b[i][j] = ob.nextInt();
            }
        }

        System.out.println("First matrix is :");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + a[i][j]);
            }

            System.out.println("\n");
        }

        System.out.println("Second matrix is :");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + b[i][j]);
            }

            System.out.println("\n");
        }

    ob.close();

    }
}
