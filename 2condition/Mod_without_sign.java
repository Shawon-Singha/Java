// mod means remainder

import java.util.Scanner;

public class Mod_without_sign 
{

  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    int n1,n2,q,mod;

    System.out.println("Enter the value of n1:");
    n1 = sc.nextInt();
    
    System.out.println("Enter the value of n2:");
    n2 = sc.nextInt();
    

    q = n1/n2; //if we n1 divide with n2 then get a result;

    mod = n1 - (n2*q);

    System.out.println("The Mod is :"+mod);

    sc.close();
  }

    
}
