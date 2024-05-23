import java.util.Scanner;
class QuesF{
public static void main(String args[]){
int a,b,c;
System.out.println("Enter the first number");
Scanner rk=new Scanner(System.in);
a=rk.nextInt();
System.out.println("Enter the Second number");
b=rk.nextInt();
c=a+b;
if(c%2==0)
{
System.out.println(c+" is Even number");
}
else
{
System.out.println(c+" is a odd number");
}
}
}
