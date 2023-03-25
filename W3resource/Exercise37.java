import java.util.Scanner;

public class Exercise37 {
    public static void main(String[] args) {
        Scanner ob1 = new Scanner(System.in);

        System.out.println("Enter the String:");
        String s =  ob1.nextLine(); 
        char s1[] =s .toCharArray();

        for (int i = s.length() - 1; i >= 0; i--) 
        {
            System.out.print(s1[i]);
        }

        ob1.close();
    }
}
