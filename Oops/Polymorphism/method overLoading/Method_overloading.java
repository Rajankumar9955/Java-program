/*==================================Method_overloading=========================================*/
class Method_overloading {
    public void add(){
        int a,b,c;
        a=10;
        b=20;
        c=a+b;
        System.out.println("Addition without argument:"+c);
    }



    public int add(int a,int b)
    {
        int c;
        a=10;
        b=20;
        c=a+b;
        System.out.println("Addition with int argument:"+c);
        return c;
    }



    public void add(float a, float b)
    {
        float c=a+b;
        System.out.println("add two float:"+c);
    }



    public  void add(double a, double b)
    {
        double c=a+b;
        System.out.println("add two double:"+c);
    }



    public void add(String a, String b){
       int  c= Integer.parseInt(a)+Integer.parseInt(b);
        System.out.println("add of String "+c);
    }


public static void main(String args[])
{
    Method_overloading obj=new Method_overloading();
    obj.add();
    obj.add(5,7);
    obj.add(12.5,2.5);
    obj.add(12.5f,12.5f);
    obj.add("1","1");
}
}