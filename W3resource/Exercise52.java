import java.util.Scanner;

public class Exercise52 {
    
   public static boolean Value(int a, int b, int c)

   // Non static method never access static method
   //Though main method static ,so needed to other static ..
    {
        return((a + b == c) || (c + a == b) || (b + c == a));
    }
    
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter our first value:");
        int x = s.nextInt();

        System.out.print("Enter our second value:");
        int y = s.nextInt();

        System.out.print("Enter our third value:");
        int z = s.nextInt();

        System.out.println("The result is:" +Value(x,y,z));

        s.close();
    }
}
