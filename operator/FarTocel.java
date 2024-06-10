import java.util.Scanner;
class FarTocel{
public static void main(String args[]){
Scanner rk=new Scanner(System.in);
System.out.println("Enter the farenheit");
double f=rk.nextDouble();
double c;
c=(5*(f-32))/9;
System.out.println(f+" degree farenheit is equal to " +c+" in celcius");
}
}
