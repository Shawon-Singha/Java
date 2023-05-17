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
 }   
}
