class L
{
    int a; String b;
    L()
    {
        a=10; b="Lalat";
    }
    void show()
    {
        System.out.println(a+" "+b);
    }
}
class U
{
    public static void main(String[] args) 
    {
        L ref=new L();
        ref.show();
    }
}