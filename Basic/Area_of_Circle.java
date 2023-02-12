import java.util.Scanner;

public class Area_of_Circle 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        float r;
        System.out.println("Enter the value of r :");
        r = sc.nextInt();

        double area = 3.1416 * r * r;

        System.out.println(area);

        sc.close();
    }
}
