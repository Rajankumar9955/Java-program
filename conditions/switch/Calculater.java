//normal calculater
import java.util.Scanner;
class Calculater{
public static void main(String args[]){
Scanner rk=new Scanner(System.in);
System.out.println("Enter your choice: ");
System.out.println("=========================================");
System.out.println("Enter + for for addition");
System.out.println("Enter - for substraction");
System.out.println("Enter * for multiplication");
System.out.println("Enter / for division");

System.out.println("=========================================");
char ch=rk.next().charAt(0);

System.out.println("==========================================");

System.out.println("Enter 1st number: ");
int n1=rk.nextInt();
System.out.println("Enter 2nd number: ");
int n2=rk.nextInt();

System.out.println("==========================================");

switch(ch){
case '+' :
System.out.println("addition: "+(n1+n2));
break;
case '-':
System.out.println("Subtraction: "+(n1-n2));
break;
case '*':
System.out.println("multiplication: "+(n1*n2));
break;
case '/':
System.out.println("Division: "+(n1/n2));
break;
default:
System.out.println("invalid Operation:");
}
}
}