import java.util.Scanner;

public class Exercise7 
{
    public static void main(String[] args) 
    {
        Scanner multi = new Scanner(System.in);

        System.out.println("Input a number:");
        int value = multi.nextInt();

        for(int i = 1;i<=10;i++)
        {
            System.out.println(value+ "x" +i +"="+(value*i) );
        }

        multi.close();
    }
}
