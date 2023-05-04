import java.util.Scanner;

public class C_to_f 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        float C;
        System.out.println("Enter the value of C :");

        C = sc.nextInt();

        float F = ((C*9)/(5+32));
        System.out.println(F);

        sc.close();

    }
    
}
