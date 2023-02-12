import java.util.Scanner;

public class Highest_in_3 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int A,B,C;
        System.out.println("Enter the value of A:");
         A = sc.nextInt();

         System.out.println("Enter the value of B:");
         B = sc.nextInt();

         System.out.println("Enter the value of C:");
         C = sc.nextInt();

         if((A>B) && (A>C))
         {
            System.out.println("A is the highest value.");
         }

         else if((B>A) && (B>C))
         {
            System.out.println("B is the highest value.");
         }

         else
         {
            System.out.println("C is the highest value.");
         }
    sc.close();

    }
}
