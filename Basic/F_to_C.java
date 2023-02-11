import java.util.Scanner;

public class F_to_C 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        float F;
        System.out.println("Enter the value of F:");

        F = sc.nextInt();

        double C = (F-32) *5/9;
        System.out.println(C);

        sc.close();
    }
}
