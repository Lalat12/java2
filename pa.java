import java.util.Scanner;
class palin{
public static void main(String args[]){
int n,temp,r,sum=0;
Scanner sc = new Scanner(System.in);
n=sc.nextInt();
temp=n;

while(n>0)
{
r=n%10;
sum=(sum*10)+r;
n=n/10;
}
if(temp==sum){
System.out.println("palindrome");
}
else{
System.out.println("not");
}
}
}
