import java.util.Scanner;

public class Exercise38 {
    public static void main(String[] args) 
    {
        Scanner ob1 = new Scanner(System.in);

        int letter = 0;
        int number = 0;
        int space = 0;
        int others = 0;

        System.out.println("Enter a String :");

        
        char s1[] = ob1.nextLine().toCharArray();

        for(int i = 0; i < s1.length(); i++) 
        {
           if(Character.isLetter(s1[i]))
           {
             letter ++;
           }

           if(Character.isDigit(s1[i]))
           {
             number ++;
           }

           if(Character.isSpaceChar(s1[i]))
           {
            space ++;
           }
           else
           {
              others ++;
           }
        }

        System.out.println("Letters:"+letter);
        System.out.println("Numbers:"+number);
        System.out.println("Space :"+space);
        System.out.println("Others:"+others);

        ob1.close();
    }
}
