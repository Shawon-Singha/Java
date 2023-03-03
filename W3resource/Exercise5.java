import java.util.Scanner;

public class Exercise5 
{
    public static void main(String[] args) 
    {
        Scanner pro = new Scanner(System.in);

        System.out.println("Input first value:");
        int value1 = pro.nextInt();

        System.out.println("Input second value:");
        int value2 = pro.nextInt();

        System.out.println(value1*value2);
    }
}
