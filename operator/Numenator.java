import java.util.Scanner;
class Numenator{
public static void main(String args[]){
Scanner rk=new Scanner(System.in);
System.out.println("Enter the numerator:");
int a=rk.nextInt();
System.out.println("Enter the Demerator:");
int b=rk.nextInt();
int c,d;
c=a/b;
d=a%b;
System.out.println("Quotiant="+c);
System.out.println("Remaider="+d);
}
}