package Singha;

import java.util.Scanner;

public class Assigment18 {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);

        String[] days = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

        for(int i = 0;i<7;i++)
        {
            int count = 0;
            System.out.println("Enter your number :");
            count++;
        if(count == 1)
            {
                break;
            }
        }
        
        int num = ob.nextInt();

        for(int i = 0;i<7;i++)
        {
            if(num == i+1) System.out.println(days[i]);
        }

        ob.close();
    }
}
