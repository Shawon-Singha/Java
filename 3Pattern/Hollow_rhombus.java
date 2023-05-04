import java.util.Scanner;

public class Hollow_rhombus 
{
    public static void main(String[] args) 
    {
         Scanner sc = new Scanner(System.in);

         int rows;
         System.out.print("Enter the number of rows:");

         rows = sc.nextInt();

         for(int rowno = 1; rowno<=rows; rowno++)
         {
            for(int spaceno = 1; spaceno<=rows - rowno; spaceno++)
            {
                System.out.print(" ");
            }

            for(int colno = 1; colno<=rows; colno++)
            {
                if(colno == 1 || colno == rows || rowno == 1 || rowno == rows)
                /*Think about 1st coloum only then last coloum. 
                again thing about 1st row only then last row */
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
     sc.close();
    }
}
    
    


