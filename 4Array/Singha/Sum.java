package Singha;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);

        int sum = 0;

        int[] num = new int[5];

        int len = num.length;
        System.out.println("Lenght of the array : " + len);

        System.out.println("Pleae Enter " +len+  " numbers");

        for (int i = 0; i < len; i++) {
            num[i] = ob.nextInt();
        }

        for (int i = 0; i < len; i++) {
            sum = sum + num[i];
        }

        System.out.println("Total value is :" + sum);

        double avg = sum / len;
        System.out.println("Average:" + avg);
    }
}
