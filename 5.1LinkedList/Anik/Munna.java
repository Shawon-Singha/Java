package Anik;

import java.util.LinkedList;

public class Munna {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.add("Shawon");
        list.add("Anik");

         System.out.println(list +"\n");

        // Another way for print

        for(String name : list) 
        {
           System.out.print(name +" ");
        }
    }
}
