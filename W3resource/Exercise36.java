import java.util.Scanner;

public class Exercise36 
{

    public static void main(String[] args) 
    {
        Scanner ob1 = new Scanner(System.in);

        System.out.print("Input the latitude of coordinate X1:");
        double x1 = ob1.nextDouble();
        x1 = Math.toRadians(x1); // point must need to convert into radian.
        
        System.out.print("Input the longitude of coordinate Y1:");
        double y1 = ob1.nextDouble();
        y1 = Math.toRadians(y1);

        System.out.print("Input the latitude of coordinate X2:");
        double x2 = ob1.nextDouble();
        x2 = Math.toRadians(x2);

        System.out.print("Input the longitude of coordinate Y2:");
        double y2 = ob1.nextDouble();
        y2 = Math.toRadians(y2);

        double radius = 6371.01;
        double d = radius * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));

        System.out.println("The distance between those points is:"+d);

        ob1.close();
    }
    
}
