import java.util.Scanner;
class Bank
{
    private double bal=5000;
    private int pwd;
    public double money;
    public void Deposit()
    {
        
        System.out.println("enter password");
        Scanner s = new Scanner(System.in);
        pwd = s.nextInt();
        if(pwd==123)
        {
            System.out.println("enter money");
        
            money = s.nextDouble();
            bal = bal+money;
            System.out.println("deposited money:"+money);
            System.out.println("Total balance:"+bal);

        }
        else{
            System.out.println("Incorrect password");

        }
    }
    public void Withdraw()
    {
        
        System.out.println("enter password");
        Scanner s = new Scanner(System.in);
        pwd = s.nextInt();
        if(pwd==123)
        {   System.out.println("enter money");
            
            money = s.nextDouble();
            bal=bal-money;
            System.out.println("withdraw money:"+money);
            System.out.println("total balance:"+bal);
        }
        else{
            System.out.println("Incorrect password");
        }
    }
    public void Checkbal()
    {
        System.out.println("enter password");
        Scanner s = new Scanner(System.in);
        pwd = s.nextInt();
        if(pwd==123)
        {
            System.out.println("total balance:"+bal);
        }
    }
}
class Customer{
    public static void main(String[] args) {
        Bank b = new Bank();
        int ch;
        System.out.println("1.Deposit");
        System.out.println("2.Withdraw");
        System.out.println("3.Checkbal");
        System.out.println("\n enter your choice");
        Scanner s = new Scanner(System.in);
        ch=s.nextInt();
        switch(ch)
        {
            case 1 : b.Deposit();
            break;
            case 2 : b.Withdraw();
            break;
            case 3 : b.Checkbal();
            break;
            default : System.out.println("Invalid choice");

        }
    }
}