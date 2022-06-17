class A
{
    int a;int b;String c;
    A(){
        a=5;b=4;c="champu";
        System.out.println(a+" "+b+" "+c);
        
    }
    A(A ref)
    {
        a=ref.a;
        b=ref.b;
        c=ref.c;
        System.out.println(a+" "+b+" "+c);
    }
}
    class B
    {
    public static void main(String[] args) {
        A r=new A();
        A r2=new A(r);
    }
    }