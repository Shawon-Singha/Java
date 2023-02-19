import java.util.Scanner;

public class Prime_number 
{
    public static void main(String[] args) 
    {
        Scanner prime = new Scanner(System.in);

        int n,count = 0;
        System.out.println("Enter the value of n:");

        n = prime.nextInt();

        for(int i = 2; i<=n/2; i++)
        {
            if(n%i==0)
            {
                count++;
                break;
            }
            
        }

        if(count== 1)
        {
            System.out.println("Not a Prime number");
        }
        else{
            System.out.println("Prime number");
        }

        prime.close();
    }
}
