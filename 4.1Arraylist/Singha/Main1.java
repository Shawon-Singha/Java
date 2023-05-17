package Singha;
import java.util.ArrayList;

import java.util.Iterator;
public class Main1 {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();  //creat arraylist

        //adding elements..
        number.add(10);
        number.add(20);
        number.add(30);


        //print ArriyList
        
            for(int x : number)
            {
                System.out.print(x +" ");
            }
         

         // Another way to print ArrayList

         /*
          * Iterator it = number.iterator();

         while(it.hasNext())
         {
            System.out.print(it.next());
         }
          */

         
        System.out.println("\nSize: "+number.size()); 

        /*
         * when we use this method ,complie suggest us to type "add(Integer value)"
         * another add(int i,Integer value);
         * When we add value first time ,we use first comment.
         * But when we add some other value in same ArrayList ,then we use first index number 
         * then put the desire value...
         */

         number.add(3,40);
         //here,first value is index number  and second value is element.

        System.out.println("Size: "+number.size()); 

    }
}
