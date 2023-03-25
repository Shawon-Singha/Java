import java.util.Scanner;

public class Exercise22 
{
    public static void main(String[] args) 
    {
        Scanner ob1 = new Scanner(System.in);

        System.out.print("Enter your DECIMAL value:");
        int value = ob1.nextInt();

        int []array = new int[10];
        int i;

        for(i = 0;value!=0;i++)
        {
            array[i] = value % 8;
            value = value / 8;
        }
        
        System.out.print("Your octal value is :");

        for(int j = i-1;j>=0;j--)
        {
            System.out.print(array[j]);
        }

    ob1.close();
    }
}
