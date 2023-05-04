public class Split 
{
    public static void main(String[] args) 
    {
       String s = "I@am@Shawon.";

       String[] a = s.split("@"); //"@" means If find @ then split it and run again.

       for (int i =0;i<a.length;i++)
       {
         System.out.println(a[i]);
       }
    }
    
}
