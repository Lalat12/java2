import java.util.Scanner;
public class Number 
{
    public static void main(String[] args) 
    {
    int num;
    System.out.println("enter number");
    Scanner sc=new Scanner(System.in);
    num=sc.nextInt();
    int i=1;
    while(i<=10)
    {
    System.out.println(i*num);
    ++i;
    }
}
}