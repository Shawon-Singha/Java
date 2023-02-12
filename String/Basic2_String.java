import java.util.Scanner;

public class Basic2_String 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String s;
        System.out.println("Enter the character:");

        // s = sc.next(); // if we give "Shawon Singha",it prints just "Shawon".For single word ,this is good 

        s = sc.nextLine(); //for whole line or para,use this. Try to use this always.

        System.out.println(s);
     sc.close();
    }
}
