import java.util.Scanner;
class ElseIf
{
    public static void main(String[] args) 
    {
        int marks;
        System.out.println("enter marks");
        Scanner sc=new Scanner(System.in);
        marks=sc.nextInt();
        if(marks>=60 && marks<=100)
        {
            System.out.println("first");}

            else if(marks>=45 && marks<60)
            {
                System.out.println("second");
            }
                else if(marks>=30 && marks<45)
                {
                    System.out.println("third");
                }
                else
                {
                    System.out.println("fail");
                }
            }
        }
