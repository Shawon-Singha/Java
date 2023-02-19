import java.util.Scanner;

public class Hollow_diagonal 
{
    public static void main(String[] args) 
    {
        Scanner loop = new Scanner(System.in);
        int rows;
         System.out.print("Enter the number of rows:");
        rows = loop.nextInt();

        for(int rowno =1; rowno<=rows; rowno++)
        {
            for(int colno = 1;colno<=rows; colno++)
            {
                if(colno == 1 || colno == rows || rowno == 1 || rowno == rows || rowno == colno || (rowno + colno == rows + 1))
                {
                    System.out.print("*");
                }
                else 
                {
                    System.out.print(" ");
                }
            }
           System.out.print("\n");
        }

        loop.close();
    }
}
