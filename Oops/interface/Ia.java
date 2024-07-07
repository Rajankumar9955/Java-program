		
/*Q1. Explain interface in java programming?
ans:-we can also achieve abstraction in java programming with interface*/

interface Ia{
int x=10;
void a();
}


interface Ib{
int y=20;
void b();
}
class Test implements Ia,Ib{
public void a(){
System.out.println("Ia Interface method:"+x);
}

public void b(){
System.out.println("Ib Interface method:"+y);
}

	public void hello(){
	System.out.println("This is Test class method");
}
public static void main(String args[]){
//Ia obj=new Ia(); C.E
Ia obj=new Test();
obj.a();
//obj.hello();
Test t= new Test();
t.hello();
t.a();
t.b();

}
}