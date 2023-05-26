package Singha;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap <Integer,String> customer = new HashMap<Integer,String>();

        customer.put(1001, "Shawon");
        customer.put(1002,"Anik");
        customer.put(1003,"Zihad");

        System.out.println(customer.get(1001)); //always use unique value for find anything
    }
}
