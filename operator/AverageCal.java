import util.java.Scanner;
class AverageCal{
public static void main(String args[]){
Scanner rk=new Scanner(System.in);

System.out.println("Enter the first number:");
int num1=rk.nextInt();

System.out.println("Enter the second number");
int num2=rk.nextInt();

System.out.println("Enter the third number:");
int num3=rk.nextInt();

System.out.println("Enter the fourth number:");
int num4=rk.nextInt();

System.out.println("Enter the fifth number:");
int num5=rk.nextInt();

int a;
a=(num1+num2+num3+num4+num5)/5;
System.out.println("Average of thats numbers:"+a);
}
}
