package Singha;
import java.util.ArrayList;

public class Main3 {
   
    public static void main(String[] args) {
        ArrayList<Integer> number1 = new ArrayList<>();
        ArrayList<Integer> number2 = new ArrayList<>();
        ArrayList<Integer> number3 = new ArrayList<>();

        number1.add(10);
        number1.add(20);
        number1.add(30);
        number1.add(40);

        System.out.println("Array of number1 :" +number1);

        number2.add(11);
        number2.add(21);
        number2.add(31);
        number2.add(41);
        System.out.println("Array of number2 :" +number2);

        
        number3.addAll(number1); // add other array value inside antoher array
        System.out.println("Array of number3 :" + number3);


        boolean x =  number1.equals(number2);
        System.out.println("Result : " +x);

        boolean y =  number1.equals(number3);
        System.out.println("Result : " +y);


        boolean z =  number2.equals(number3);
        System.out.println("Result : " +z);

    }
}


