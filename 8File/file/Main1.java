package file;

import java.util.Formatter;

public class Main1 {
   
    public static void main(String[] args) {
        try{
            Formatter formatter = new Formatter("D:/Java/8File/Person/Student.txt");

            formatter.format("%s %s\r\n","101","Shawon");
            formatter.format("%s %s\r\n","102","Singha");
            formatter.format("%s %s\r\n","103","Anik");

            System.out.println("Build Successfull");

            formatter.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
