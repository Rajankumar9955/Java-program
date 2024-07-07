/**
  InnerinheritanceINiterface
 */


    
interface InnerinheritanceINiterface {
    int x=10;
    void a();
}

interface Ib{
    int y=20;
    void b();
}

interface IC extends InnerinheritanceINiterface,Ib{
    int z=30;
    void c();
}

class Test implements IC{
    public void a()
    {
        System.out.println("InnerinheritanceINiterface interface method:"+x);
    }
    public void b()
    {
        System.out.println("Ib interface method:"+y);
    }
    public void c()
    {
        System.out.println("ic interface:"+z);
    }
    public void hello()
    {
        System.out.println("This is test class method");
    }



    public static void main(String[] args) {
        //Ia =new Ia(); //C.E.
        InnerinheritanceINiterface obj=new Test();
        obj.a();
        //obj.hello();
        Test t =new Test();
        t.hello();
        t.a();
        t.b();
        t.c();
        //t.x=22
    }
}