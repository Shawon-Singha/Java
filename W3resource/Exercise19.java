import java.util.Scanner;
public class Exercise19 
{
    public static void main(String[] args) 
    {
        Scanner ob1 = new Scanner(System.in);

        System.out.println("Enter the decimal value :");
        int value = ob1.nextInt();
        
        int []array = new int[20];

        int i = 0;
        

        while(value!=0)
        {
            array[i]= value % 2;
            value = value / 2;
            i++;
        }
         
        
        for(int j = i-1; j>=0; j--)
        {
            System.out.print(array[j]);
        }

       

        ob1.close();

    }
}
