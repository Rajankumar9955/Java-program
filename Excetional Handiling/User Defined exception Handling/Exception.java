
class Exception{
    public static void main(String args[])
    {
        int a=-1;
        try{
            a=Integer.parseInt(args[0]);
            if(a<0 || a>100)
            {
               AgeException ae=new AgeException("invalid age");
                throw ae;
            }
            System.out.println("valid age");
        }
        catch(AgeException x)
        {
            System.out.println(x.getMsg());
        }
    }
}