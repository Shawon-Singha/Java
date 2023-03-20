import java.util.Scanner;

public class Exercise34 
{
    public static void main(String[] args) 
    {
        Scanner ob1 = new Scanner(System.in);

        System.out.println("Enter the value:");
        int value = ob1.nextInt();

        double Hexagon =  (6 * value * value)/(4*Math.tan(Math.PI/6));
        
        System.out.println("The area of the hexagon is: " +Hexagon);

        ob1.close();
    }

}

