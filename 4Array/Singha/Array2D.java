package Singha;

import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);

        int[][] num = new int[2][3];

        System.out.println("Enter the value:");

        for(int i = 0;i<2;i++)
        {
            for(int j = 0;j<3;j++)
            {
                num[i][j] = ob.nextInt();
            }
        }


        for(int i = 0;i<2;i++)
        {
            for(int j = 0;j<3;j++)
            {
                System.out.print(" " +num[i][j]);
            }
            System.out.println("\n");
        }

        ob.close();
    }
}
