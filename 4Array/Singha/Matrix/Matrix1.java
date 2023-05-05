package Singha.Matrix;

import java.util.Scanner;

public class Matrix1 {
    public static void main(String[] args) {
        
        Scanner ob = new Scanner(System.in);

        int[][] a = new int[3][3];
        int sum = 0, sum2 = 0, sum1 =0;

        System.out.println("Enter the matrix:");
        for(int i =0; i<3;i++)
        {
            for(int j = 0;j<3;j++)
            {
                a[i][j] = ob.nextInt();
            }
        }

        //sum of diagonal elements.
        for(int i =0; i<3;i++)
        {
            for(int j = 0;j<3;j++)
            {
               if(i == j)
               {
                sum = sum + a[i][j];
               }
            }
        }
        System.out.println("Sum od diaginal element: "+sum);


        //sum of upper triangle.
        for(int i =0; i<3;i++)
        {
            for(int j = 0;j<3;j++)
            {
               if(i>j)
               {
                
                sum1 = sum1 + a[i][j];
               }
            }
        }
        System.out.println("Sum of upper triangle: "+sum1);

        //sum of lower triangle.
        for(int i =0; i<3;i++)
        {
            for(int j = 0;j<3;j++)
            {
               if(i<j)
               {
                 
                sum2 = sum2 + a[i][j];
               }
            }
        }
        System.out.println("Sum of lower triangle:"+sum2);

        ob.close();
    }
}
