import java.util.Scanner;

public class Exercise53 {
    
    public static boolean test(int p, int q, int r, boolean xyz)
     {
	   if(xyz)
		  return (r > q);
	   return (q > p && r > q);
     }
     
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter your first value:");
        int a = s.nextInt();

        System.out.println("Enter your second value:");
        int b = s.nextInt();

        System.out.println("Enter your third value:");
        int c = s.nextInt();

        System.out.print("The result is: "+test(a,b,c,true));

        s.close();


    }
}
