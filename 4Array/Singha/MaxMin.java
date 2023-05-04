package Singha;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);


        int[] num = new int[5];

        int len = num.length;
        System.out.println("Lenght of the array : " + len);

        System.out.println("Pleae Enter " +len+  " numbers");

        for(int i = 0;i<len;i++)
        {
            num[i] = ob.nextInt();
        }

        int max = num[0];

        for(int i = 1;i<len;i++)
        {
            if(num[i]>max){
                max = num[i];
            }
        }

        int min = num[4];

        for(int i = 0;i<len-1;i++)
        {
            if(num[i] < min)
            {
                min = num[i];
            }
        }

        System.out.println("Maxmium value is : "+max);
        System.out.println("minimum value is :"+min);



        ob.close();
    }
}
