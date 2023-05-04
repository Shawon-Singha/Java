import java.util.Scanner;

public class Even_Odd 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int N; // usse int value for proper result.
        System.out.println("Enter the value of N:");

        N = sc.nextInt();

        if(N%2==0)
        {
            System.out.println("Even");
        }

        else
        {
            System.out.println("Odd");

        }

        sc.close();


    }
    
}
