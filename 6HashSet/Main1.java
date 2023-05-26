package Singha;

import java.util.HashSet;

public class Main1 {

    public static void main(String[] args) {
         HashSet<String> fruits = new HashSet<String>();

            fruits.add("Apple");
            fruits.add("Orange");
            fruits.add("Mango");
            fruits.add("Jack Fruits");

        System.out.println(fruits);

        System.out.println(fruits.size());

        fruits.remove("Apple");
        System.out.println(fruits);

        fruits.removeAll(fruits);
        //fruits.clear();
        System.out.println(fruits);

        boolean x = fruits.isEmpty();
        System.out.println(x);

        
    }
   


}
