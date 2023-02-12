import java.util.Scanner;

public class Find_Big_Num 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int A,B;
         
        System.out.println("Enter the value of A:");
        System.out.println("Enter the value of B:");

        A = sc.nextInt();
        B = sc.nextINt();

        if(A>B)
        {
            System.out.println("A is the highest value.");
        }
        else
        {
            System.out.println("B is the highest value.");
        }

        sc.close();
    }
}
