import java.util.Scanner;

public class String_length 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String a;
        System.out.println("Enter the String:");
    
        a = sc.nextLine();

        int len = a.length();

        System.out.println("The string lenght is:"+len);

    sc.close();
    
    }
    
}
