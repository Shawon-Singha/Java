import java.util.Scanner;

public class Split1 
{
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
       
       String s;

       System.out.println("Enter the string:");
       s = sc.nextLine();

       //Scan any string and may be have inside any sign like "! @ # $ % & *"

       String[] a = s.split("#"); // in my String, i use "#".so i use "#" inside parentheses.

       for(int i =0;i<a.length;i++)
       {
        System.out.print(a[i]);
       }

       sc.close();
    }
}
