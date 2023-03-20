import java.util.Scanner;

public class Exercise35 
{
    public static void main(String[] args) 
    {
        Scanner ob1 = new Scanner(System.in);

        System.out.println("Input the number of sides on the polygon");
        int value1 = ob1.nextInt();

        System.out.println("Input the length of one of the sides:");
        int value2 = ob1.nextInt();

        double Area =  (value2 * (value1 * value1))/(4* Math.tan(Math.PI/ value2));

        System.out.println("The area is :" +Area);

        ob1.close();
    }
}
