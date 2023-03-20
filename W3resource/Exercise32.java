import java.util.Scanner;

public class Exercise32 
{
    public static void main(String[] args) 
    {
        Scanner ob1 = new Scanner(System.in);

        System.out.println("Enter the first value:");
        int input1 = ob1.nextInt();

        System.out.println("Enter the second value:");
        int input2 = ob1.nextInt();

        if(input1 == input2)  System.out.println(input1+ "= = " +input2);
        if(input1 > input2)  System.out.println(input1+ ">" +input2);
        if(input1 < input2)  System.out.println(input1+ "<" +input2);
        if(input1 >= input2) System.out.println(input1+ ">=" +input2);
        if(input1 <= input2) System.out.println(input1+ "<=" +input2);
        if(input1 != input2) System.out.println(input1+ "!=" +input2);

        ob1.close();
       
    }
}
