import java.util.Scanner;

public class Exercise6 
{
    public static void main(String[] args) 
    {
        Scanner arthe = new Scanner(System.in);
        
        System.out.println("Input first number:");
        int value1 = arthe.nextInt();

        System.out.println("Input second number:");
        int value2 = arthe.nextInt();

        System.out.println(value1+value2);
        System.out.println(value1-value2);
        System.out.println(value1*value2);
        System.out.println(value1/value2);
        System.out.println(value1%value2);

        arthe.close();
    }
}
