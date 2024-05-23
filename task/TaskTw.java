import java.util.Scanner;
class TaskTw{
public static void main(String args[]){
float f;
System.out.println("Enter the number:");
Scanner rk=new Scanner(System.in);
f=rk.nextFloat();
if(f>=1000000)
{
System.out.println(f+" number is large");
}
else if(f<0)
{
System.out.println(f+" is negative number:");
}
else if(f>0 && f<1)
{
 System.out.println(f+" this is small number");
}
else if(f==0)
{
System.out.println(f+" This is zero number");
}
else 
{
System.out.println(f+" is a positive number");
}
}
}
