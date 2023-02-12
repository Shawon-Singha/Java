import java.util.Scanner;

public class Positive_Negative 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int N;

        System.out.println("Enter the value of N:");

        N = sc.nextInt();

        if(N>0)
        {
            System.out.println("Positive Number");
        }

        else
        {
          System.out.println("Negative Number");
        }

        sc.close();
    }
}
