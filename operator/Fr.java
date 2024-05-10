import java.util.Scanner;
class Fr{
public static void main(String args[]){
Scanner rk=new Scanner(System.in);
System.out.println("Enter the number:");
int n=rk.nextInt(); //1234
int seclast=n%100;
int sec=seclast/10;
System.out.println("second last number:"+sec);
}
}
