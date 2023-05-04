package Singha;

import java.util.Scanner;

public class Array_2D {
    public static void main(String[] args) {
        
        Scanner ob = new Scanner(System.in);
        
        int[][] a = new int[2][3];
        int [][] b = new int[2][3];

        int[][] c = new int[2][3];

        System.out.println("Enter the value of first matrix:");

        for(int i = 0; i<2;i++)
        {
            for(int j = 0; j<3;j++)
            {
                a[i][j] = ob.nextInt();
            }
        }

        System.out.println("Enter the value of second matrix:");

        for(int i = 0; i<2;i++)
        {
            for(int j = 0; j<3;j++)
            {
                b[i][j] = ob.nextInt();
            }
        }

            System.out.println("\n");

        for(int i = 0; i<2;i++)
        {
            for(int j = 0; j<3;j++)
            {
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(" "+c[i][j]);
            }
            System.out.println("\n");
        }





    ob.close();
    }
}
