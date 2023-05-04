import java.util.Scanner;

public class Area_of_Triangle 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        float b,h;
        System.out.println("Enter the value of b:");

        b = sc.nextInt();
        
        System.out.println("Enter the value of h:");
        h = sc.nextInt();

        double area =(float).5*b*h;
        System.out.println(area);
        sc.close();
    }
}
