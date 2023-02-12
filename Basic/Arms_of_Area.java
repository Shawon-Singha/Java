import java.util.Scanner;

public class Arms_of_Area 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        float a,b,c;
        System.out.println("Enter the value of A:");
        a = sc.nextInt();

        System.out.println("Enter the value of B:");
        b=sc.nextInt();

        System.out.println("Enter the value of C:");
        c=sc.nextInt();


        double s = (a+b+c)/3;
        double area = (sqrt(s*(s-a)*(s-b)*(s-c)));

        System.out.println(area);
    }
}
