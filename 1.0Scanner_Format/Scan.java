import java.util.Scanner; 
/*"java.util" is a package,in the package "Scanner" is a class */
//for "Scanner", "sc" is a object.

public class Scan 
{
    public static void main(String[] args) 
    {
        Scanner sc /*class */ = new Scanner(System.in); /*method */
        /*"System.in" means taking input from user */

      
        System.out.println("Enter the value of x:");

        int x = sc.nextInt();
        // Inside the "sc" class, many function are builded. nextInt is one of them.

        String s = sc.next();  // Before the space,just print.

        // String r = sc.nextLine();  //"For whole line like "gets" in C.

        System.out.println(x);
        System.out.println(s);

        sc.close(); // close the Scan
    }
    
}
