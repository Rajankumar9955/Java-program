import java.util.Scanner;
class TaskS{
public static void main(String args[]){
int a;
System.out.println("Enter the year");
Scanner rk=new Scanner(System.in);
a=rk.nextInt();
if(a%4==0)
{
System.out.println(a+" is a leap year");
}
else 
{
System.out.println(a+" is not a leap year");
}
}
}