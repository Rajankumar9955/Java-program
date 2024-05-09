//step:1
import java.util.Scanner;

class AddNumber{
public static void main(String args[]){
   //step:2
 Scanner kb=new Scanner(Scanner.in);
 //step:3
 System.out.prinln("Enter First Number:");
int n1=kb.nextInt();
System.out.println("Enter Second Number:");
int n2=kb.nextInt();

//step:4
int n3=n1+n2;
System.out.println("Addition:"+n3);
}
}