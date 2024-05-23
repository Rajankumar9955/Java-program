import java.util.Scanner;
class TaskSe{
public static void main(String args[]){
float a,b,c,d,e,sum;
System.out.println("Enter the first number:");
Scanner rk=new Scanner(System.in);
a=rk.nextFloat();
System.out.println("Enter the second number:");
b=rk.nextFloat();
System.out.println("Enter the third number:");
c=rk.nextFloat();
System.out.println("Enter the fourth number:");
d=rk.nextFloat();
System.out.println("Enter the fifth number:");
e=rk.nextFloat();
sum=a+b+c+d+e;
System.out.println("Sum of that's number: "+sum);
System.out.println("Average of That's number: "+sum/5);
}
}