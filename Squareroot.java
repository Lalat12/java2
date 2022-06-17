import java.util.Scanner;
public class Squareroot 
{
   public static void main(String[] args) 
   {
       int num;
       System.out.println("enter num");
       Scanner sc=new Scanner(System.in);
       num=sc.nextInt();
       double c=Math.sqrt(num);

       System.out.println("square root is"+c);

   } 
}
