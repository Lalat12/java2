import java.util.Scanner;
abstract class Bank2
{
    public String name="SBI";
    public String IFSC="123456";

    public void bankDetail()
    {
        System.out.println("Bank_name:"+name+" "+"Bank_IFSC code:"+IFSC);
    }
    abstract void Deposit();
    abstract void Withdraw();
    abstract void Checkbal();

}
class bankService extends Bank2
{
    private double bal=5000;
    private int pwd;
    public double money;

    public void Deposit()
    {
        System.out.println("enter password");
        Scanner s=new Scanner(System.in);
        pwd=s.nextInt();
        if(pwd==123)
        {
            System.out.println("enter amount");
            money=s.nextDouble();
            bal=bal+money;
            System.out.println("deposited money:"+money);
            System.out.println("Total balance:"+bal);
        }
        else
        {
            System.out.println("incorrect password");
        }
    }
    public void Withdraw()
    {
        System.out.println("enter password");
        Scanner s=new Scanner(System.in);
        pwd=s.nextInt();
        if(pwd==123)
        {
            System.out.println("enter withdraw amount");
            money=s.nextDouble();
            bal=bal-money;
            System.out.println("withdraw amount:"+money);
            System.out.println("total balance:"+bal);
        }
        else
        {
            System.out.println("incorrect password");
        }
    }
    public void Checkbal()
    {
        System.out.println("enter password");
        Scanner s=new Scanner(System.in);
        pwd=s.nextInt();
        if(pwd==123)
        {
            System.out.println("total balance:"+bal);

        }
        else
        {
            System.out.println("incorrect password");
        }
    }
    
}
class Customer2
{
    public static void main(String[] args) {
        bankService b=new bankService();
        b.bankDetail();
        int ch;
        System.out.println("1.Deposit");
        System.out.println("2.Withdraw");
        System.out.println("3.Checkbal");
        System.out.println("\nEnter your choice");
        Scanner s=new Scanner(System.in);
        ch=s.nextInt();
        switch(ch)
        {
            case 1: b.Deposit();
            break;
            case 2: b.Withdraw();
            break;
            case 3: b.Checkbal();
            break;
            default: System.out.println("invalid choice");
        }
    }
}