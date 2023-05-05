package Singha.Matrix;

import java.util.Scanner;

public class Matrix3 {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);

        int[][] num = new int[4][];
        int k = 0;

        for(int i = 0;i<4;i++)
        {
            num[i] = new int[i+1];
        }

        for(int i = 0;i<4;i++)
        {
            for(int j = 0;j<i+1;j++)
            {
                num[i][j] = k;
                k++;
            }
            
        }
        for(int i = 0;i<4;i++)
        {
            for(int j = 0;j<i+1;j++)
            {
               System.out.print(num[i][j] +" ");
            }
            System.out.println();
            
        }
    ob.close();
    }
}
