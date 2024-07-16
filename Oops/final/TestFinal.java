// Final key word:-final keyword is 


class TestFinal{
     final int X; //final variable
   public TestFinal(){

     X=20;
}
}
class Hello extends TestFinal{
       public void show(){
      System.out.println("This is parent class show :"+X);
}
public static void main(String args[]){

 final int b=10;
Hello t=new Hello();
System.out.println("Final local variable:"+b);
t.show();
}
	
}


       


