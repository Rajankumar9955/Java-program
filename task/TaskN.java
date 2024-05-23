import java.util.Scanner;
class TaskN{
public static void main(String args[]){
int a,b,c;
System.out.println("Enter the first number:");
Scanner rk=new Scanner(System.in);
a=rk.nextInt();
System.out.println("Enter the second number:");
b=rk.nextInt();
System.out.println("Enter the third number:");
c=rk.nextInt();
if(a<b && b<c)
{
System.out.println("Increasing order");
}
else if(a>b && b>c)
{
System.out.println("This is decreasing order");
}
else
{
System.out.println("Constant");
}
}
}

