package Singha;

import java.util.ArrayList;

public class Main2 {
 public static void main(String[] args) {
    ArrayList<Integer> number = new ArrayList<>();  //creat arraylist

        //adding elements..
        number.add(10);
        number.add(20);
        number.add(30);

        //for remove array

        number.remove(1);

        for(int x : number){
            System.out.print(x +" ");
        }

        

        // for remove all  arraylist

        number.removeAll(number);

        for(int x : number){
            System.out.println(" " + x +" ");
        }

        number.clear(); //work as remove,clear all data
        System.out.println("\nAfter clear arraylist: ");

        boolean c = number.isEmpty(); //for check empty or not
        System.out.println("Arratlist empty:" +c);


        boolean d = number.contains(30); //check input number is available in arraylist.
        System.out.println("\n" +d);

        
        ArrayList<Integer> numbber1 = new ArrayList<>();

        numbber1.add(11);
        numbber1.add(21);
        numbber1.add(31);


 
        int x = numbber1.indexOf(11);  //to see index.
        System.out.println("the index of 1 is : "+x);


        number.set(1, 12);

 }   
}
