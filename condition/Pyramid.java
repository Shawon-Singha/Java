import java.util.Scanner;

public class Pyramid 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int rows;
        System.out.print("Enter the number of rows:");

        rows = sc.nextInt();

        for(int i = 1;i<=rows;i++)
        {
            for(int j = 1;j<=rows - i;j++) //for space print
            {
                System.out.print(" ");
            }

            for(int k = 1;k<=2*i-1;k++)  //for * print in row.
            {
                System.out.print("*");
            }
         System.out.print("\n");
        }
        sc.close();
    }
    
}
