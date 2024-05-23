import java.util.Scanner;
class taskTh{
public static void main(String args[]){
float a,b;
System.out.println("Enter the first number ");
Scanner rk=new Scanner(System.in);
a=rk.nextFloat();
System.out.println("Enter the second number:");
b=rk.nextFloat();
if(a==b)
{
System.out.println("This is same number");
}
else
{
System.out.println("This is not same number:");
}
}
}