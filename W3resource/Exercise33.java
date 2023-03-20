import java.util.Scanner;

public class Exercise33 
{
    public static void main(String[] args) 
    {
        Scanner ob1 = new Scanner(System.in);

        System.out.println("Enter the value");

        int value = ob1.nextInt();
        long sum = 0;


        while(value != 0)
        {
            sum += value % 10;
            value = value /10;
        }

        System.out.println("Toal of that value :" +sum);

        ob1.close();
    }
}
