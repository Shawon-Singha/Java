import java.util.Scanner;

public class Quadric_Equation 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        float a,b,c,d,x1,x2;

        System.out.println("Enter the value of a,b,c:");

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        d = ((b*b) - (4*a*c));

        if(d>0)
        {
            x1 = (-b+d)/2*a;
            x2 = (-b-d)/2*a;

            System.out.println("The value of X1 and X2 :"+x1,x2);
        }

        else if(d==0)
        {
            System.out.println("");
        }

        


    }
}
