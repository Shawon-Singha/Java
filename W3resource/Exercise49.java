import java.util.Scanner;

public class Exercise49 {
    public static void main(String[] args) {
        
        System.out.print("Enter the value :");
    
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        if(n % 2 == 0) System.out.println("1");
        else System.out.println("0");
    }
}
