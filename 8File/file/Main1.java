package file;

import java.util.Formatter;
import java.util.Scanner;

public class Main1 {
   
    public static void main(String[] args) {
        String id,name;
        try{
            Formatter formatter = new Formatter("D:/Java/8File/Person/Student.txt");
            Formatter formatter1 = new Formatter("D:/Java/8File/Person/Teacher.txt");

            Scanner sc = new Scanner(System.in);

            System.out.print("How many Students: ");
            int num1 = sc.nextInt();

            System.out.print("How many teacher:");
            int num2 = sc.nextInt();

            for(int i = 1;i<=num1;i++){
                
                System.out.print("Enter Student id " +i + " and name" +i +":");
                id = sc.next();
                name = sc.next();

                formatter.format("%s %s\r\n",id,name);
            }

            System.out.println("\n");

            for(int i = 1;i<=num2;i++){
                System.out.print("Enter teacher id " +i+ "and name" +i+ ":");
                id = sc.next();
                name = sc.next();

                formatter1.format("%s %s\r\n",id,name);
            }
            // System.out.println("Build Successfull");

            sc.close();

            formatter.close();
            formatter1.close();
        }catch(Exception e){
            System.out.println(e);
        }

       
    }
}
