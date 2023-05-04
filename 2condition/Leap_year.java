import java.util.Scanner;

public class Leap_year 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int year;

        System.out.println("Enter the year:");
        year = sc.nextInt();

        if(year%400==0)
        {
            System.out.println("This is a Leap year");
        }

        else if((year%4==0) && (year%100!=0))
        {
            System.out.println("This is a Leap year.");
        }

        else 
        {
            System.out.println("This is a common year.");
        }
     sc.close();
    }
}
