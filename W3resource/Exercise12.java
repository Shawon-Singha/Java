import java.util.Scanner;

public class Exercise12 
{
    public static void main(String[] args) 
    {
        Scanner avg = new Scanner(System.in);

        System.out.println("Enter the first value:");
        int value1 = avg.nextInt();

        System.out.println("Enter the second value:");
        int value2 = avg.nextInt();

        System.out.println("Enter the third value:");
        int value3 = avg.nextInt();
        
        float average;
         average = (float)(value1+value2+value3)/3;  //Typecast

        System.out.println(average);

        avg.close();

    }
}
