package file;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("Person"); //file created where this code available
       /*
        *  someone want to create file in another location,then
        * File dir = new File("Folder location");
        *  File dir = new File("C:/Users/User/OneDrive\Desktop/Person");
        */
        //File dir = new File("C:/Users/User/OneDrive/Desktop/Person");
        file.mkdir(); // directory is created.

        String path = file.getAbsolutePath();
        System.out.println(path);

        File file1 = new File("D:/Java/8File/Person/Student.txt"); //file under person folder
        File file2 = new File("D:/Java/8File/Person/Teacher.txt"); //file under person folder
        
        
       try{
            file1.createNewFile();
            file2.createNewFile();
            System.out.println("Created");
       }catch(Exception e){
        System.out.println(e);
       }
    }
}
