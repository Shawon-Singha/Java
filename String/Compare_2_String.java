import java.util.Scanner;

public class Compare_2_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1, s2;

        System.out.print("Enter the first string:"); // println means print and add a new line
        s1 = sc.nextLine();

        System.out.print("Enter the second string :");
        s2 = sc.nextLine();

        System.out.println(s1);
        System.out.println(s2);
        if (s1 == s2) {
            System.out.println("They are equal.");
        } else {
            System.out.println("They are not equal.");
        }
        sc.close();

    }

}

// import java.util.Scanner;

// public class StringInput {
// private String s1, s2;
// Scanner sc = new Scanner(System.in);

// public StringInput() {
// System.out.print("Enter the first string: ");
// s1 = sc.nextLine();
// System.out.print("Enter the second string: ");
// s2 = sc.nextLine();
// }

// public String getS1() {
// return s1;
// }

// public String getS2() {
// return s2;
// }
// }

// public class CompareStrings {
// public static void main(String[] args) {
// StringInput input = new StringInput();
// String s1 = input.getS1();
// String s2 = input.getS2();

// System.out.println("String 1: " + s1);
// System.out.println("