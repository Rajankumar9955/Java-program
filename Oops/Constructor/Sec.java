

public class Sec {
    int x=10;
    public Sec()
    {
        System.out.println("This is Sec class Default constructor");

    }
    public Sec(int x)
    {
        this.x=x;
        System.out.println("This is Sec class parametrized Constructor");
    }
}

class B extends Sec{
    int y=20;
    public B()
    {
        System.out.println("This is B class default constructor");
    }
    public B(int x, int y)
    {
        super(x);
        this.y=y;
        System.out.println("This is B class parametrized constructor");
    }
}
class C extends B{
   int z=30;
   public C()
   {
    System.out.println("This is Default Construcotr");
   }
   public C(int x,int y,int z)
   {
    super(x,y);
    this.z=z;
    System.out.println("This is class parametrized constructor");
   }
   public void show()
   {
    System.out.println("This is Sec parent X"+super.x);
    System.out.println("Thisi is B child X"+super.y);
    System.out.println("This is C Child"+z);
   }
   public static void main(String args[])
   {
    C obj=new C(1,2,3);
    obj.show();
   }
}