package Singha;

import java.util.ArrayList;
import java.util.Collections;

public class Main4 {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();

        number.add(10);
        number.add(25);
        number.add(100);
        number.add(-50);
        number.add(-5);
        number.add(205);

        System.out.println("Before sorting : " + number);

        Collections.sort(number); // ascending ( lower to upper) 
        System.out.println("After ascending : "+number);


        Collections.sort(number,Collections.reverseOrder());
        /*first ascend value then reverse value,desending will be done */

        System.out.println("After desending : "+number);
    }
}
