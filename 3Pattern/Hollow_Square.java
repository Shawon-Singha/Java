public class Hollow_Square 
{
    public static void main(String[] args) 
    {
        int rows = 5;

        for(int i =1;i<=5;i++)
        {
            for(int j = 1;j<=rows;j++)
            {
                if(i==1 || i==rows || j==1 || j==rows)
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
    }
}
