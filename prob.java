import java.util.Scanner;

class Prob{
public static void main(String [] args){
String a;
int b;
Scanner sc = new Scanner(System.in);
a = sc.nextLine();
b = sc.nextInt();
if (b<100){
System.out.println(a+" "+" "+" "+"0"+b);
}else{
System.out.println(a+" "+" "+" "+b);
}
}
}