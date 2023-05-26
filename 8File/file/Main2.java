package file;

import java.io.File;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        try{
            File file = new File("D:/Java/8File/Person/Student.txt");

            System.out.println("hi");

            Scanner sc = new Scanner(file);

            while(sc.hasNext()){
                String id = sc.next();
                String name = sc.next();
                System.out.println("Student id : " +id+ "and name : " +name);
            }

            sc.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
