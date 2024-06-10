import java.util.Scanner;
class Allopr{
public static void main(String args[]){
int a,b;
Scanner rk=new Scanner(System.in);
System.out.println("Enter the first number:");
a=rk.nextInt();
System.out.println("Enter the second number:");
b=rk.nextInt();
int c=a+b;
int d=a-b;
int e=a*b;
int f=a/b;
int g=a%b;
System.out.println(c);
System.out.println(d);
System.out.println(e);
System.out.println(f);
System.out.println(g);
}
}