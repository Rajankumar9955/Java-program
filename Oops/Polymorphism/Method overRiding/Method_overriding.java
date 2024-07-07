 class Method_overriding {
    public void hi(){
        System.out.println("This is Parent class hi....method()");

    }
    
}
class b extends Method_overriding{
    public void hi()
    {
        System.out.println("This is child class hi.. method()");
    }
    public static void main(String args[])
    {
        Method_overriding obj=new b();
        obj.hi();
    }

}