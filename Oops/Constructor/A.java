




 class Con{
    int y=10;
    public Con()
    {
        System.out.println("This is A class Default construfctor");
    }
    public static void main(String args[])
    {
        System.out.println("This is A class Main");
    }
}
class B extends Con{
    int x=20;
    public B()
    {
        System.out.println("This is B class Default Constructor");
    }
}

class C extends B{
    int x=30;
    public C()
    {
        System.out.println("This is C class Default Constructor");
    }
    public void show()
    {
        System.out.println("This is A class Parent X:"+super.y);
        System.out.println("This is B Child X:"+super.x);
        System.out.println("This is C child X:"+x);
    }
    public static void main(String args[])
    {

        C obj=new C();
        obj.show();

    }
}
