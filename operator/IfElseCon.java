//
/*import java.util.Scanner;
class IfElseCon{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number:");
int a;
a=sc.nextInt();
if(a>0)
      {
       System.out.println("This is positive number:");
      }

if(a<0)
    {
      System.out.println("This is Negative number:");
    }
  }
}
*/



import java.util.Scanner;
class ElseIf{
public static void main(String args[]){
Scanner rk=new Scanner(System.in);
int a;
System.out.println("Enter any number for even or odd");
a=rk.nextInt();
if(a%2==0)
{
System.out.println("even number:"+a);
}
else(a%2!=0)
{
System.out.println("odd number:"+a);
}

