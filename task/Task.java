import java.util.Scanner;
class Task{
public static void main(String args[]){
int a,b,c;
System.out.println("Enter the first number:");
Scanner rk=new Scanner(System.in);
a=rk.nextInt();
System.out.println("Enter the second number:");
b=rk.nextInt();
System.out.println("Enter the Third number:");
c=rk.nextInt();
if(a>b && a>c)
{
System.out.println(a + " is greater");
}
else if(b>a && b>c)
{
System.out.println(b + " is greater");
}
else
{
System.out.println(c + " is greater");
}
}
}