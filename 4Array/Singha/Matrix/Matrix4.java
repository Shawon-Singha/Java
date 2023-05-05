package Singha.Matrix;

import java.util.Arrays;

public class Matrix4 {
    public static void main(String[] args) {

        int[] num = { 10, 14, 6, 9, 15 };

        Arrays.sort(num);

        System.out.print("Ascending: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(" " +num[i]);
        }
        System.out.println();

        System.out.print("Decending: ");
        for(int i = 4;i>=0;i--)
        {
            System.out.print(" "+num[i]);
        }
    }
}
