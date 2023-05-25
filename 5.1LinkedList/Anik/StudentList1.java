package Anik;

import java.util.LinkedList;

public class StudentList1 {
    public static void main(String[] args) {
       LinkedList<StudentList> list = new LinkedList<StudentList>();

       //creat student

       StudentList s1 = new StudentList("Shawon","806",5290);
       StudentList s2 = new StudentList("Anik","806",5291);
       StudentList s3 = new StudentList("Singha","806",5292);
       

       //adding student to the stuedntList
       list.add(s1);
       list.add(s2);
       list.add(s3);

       // info display

       for(StudentList s : list){
        System.out.println(s.name +" "+ s.classroom +" "+ s.id );
       }
    }
}
