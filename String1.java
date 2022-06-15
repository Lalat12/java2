class StringClass
{
    public static void main(String[] args) 
    {
        String str="lalat";
        String str2=new String("lalat");
        if(str==str2)
        {
            System.out.println("both are same");
        }
        else{
            System.out.println("not same");
        }
        if(str.equals(str2))
        {
            System.out.println("both are same");
        }
        else{
            System.out.println("not same");
        }
        int l=str.length();
        System.out.println(l);
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
    }
}
