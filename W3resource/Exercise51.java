import java.util.*;
public class Exercise51 {

 public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Input a number(string): ");
        String str1 = s.nextLine();

		int result = Integer.parseInt(str1); // formate of String to int converter

        System.out.printf("The integer value is: %d",result);
		System.out.printf("\n");

        s.close();
    }
}
