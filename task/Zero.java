import java.util.Scanner;
class Zero{
public static void main(String args[]){
int n;
System.out.println("Enter the number");
Scanner rk=new Scanner(System.in);
n=rk.nextInt();
if(n>0)
{
System.out.println(n+" This is positive number");
}
else if(n<0)
{
System.out.println(n+" This is negative number");
}
else
{
System.out.println(n+" This is zero number");
}
}
}