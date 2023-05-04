import java.util.Scanner;

public class Concatenate_2_String 
{
    public static void main(String[] args)
    {
        Scanner chill = new Scanner(System.in);

        String s1,s2;
        
        System.out.println("Enter the first string:");
        s1 = chill.nextLine();

        System.out.println("Enter the second string:");
        s2 = chill.nextLine();

        System.out.println(s1+""+s2);

        chill.close();

    }
}
