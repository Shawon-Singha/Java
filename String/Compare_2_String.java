import java.util.Scanner;

public class Compare_2_String 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String s1,s2;

        System.out.print("Enter the first string:"); // println means print and add a new line
        s1 = sc.nextLine();

        System.out.println("");

        System.out.print("Enter the second string :");
        s2 = sc.nextLine(); 


        if(s1 == s2)
        {
            System.out.println("They are equal.")
        }

        else 
        {
            System.out.println("They are not equal.");
        }
     sc.close();
        
    }
}
