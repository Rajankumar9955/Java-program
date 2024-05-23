import java.util.Scanner;
class QuesT{
public static void main(String args[]){
int a,b;
System.out.println("Enter the first number");
Scanner rk=new Scanner(System.in);
a=rk.nextInt();
System.out.println("Enter the Second number");
b=rk.nextInt();
if(a>b)
{
System.out.println(a+" is greater");
}
else
System.out.println(b+" is greater");
}
}
