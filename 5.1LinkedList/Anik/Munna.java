package Anik;

import java.util.LinkedList;

public class Munna {
   
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.add("Shawon");
        list.add("Anik");

        System.out.println(list);

        // Another way to add value
        list.add( 2, "Hello");


        //  System.out.println(list +"\n");

        // Another way for print

        for(String name : list) 
        {
           System.out.print(name +" ");
        }


        list.addFirst("Lion");  // before the list, add ....means it will be add in '0' index
        list.addLast("Tiger");  // at last, this value will be added

        System.out.println("\n"+list);
         

        list.remove(4); // index '4' will be removed
        System.out.println("\n"+ list);

        list.remove("Lion");  // just "Lion " will be deleted
        System.out.println(list);

        // list.removeAll(list);
        list.clear();  // both are same..
        System.out.println(list);
    }
}
