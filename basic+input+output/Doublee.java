//use of double

import java.util.Scanner;
class Doublee{
public static void main(String args[]){
double r,ar,cr;
Scanner obj=new Scanner(System.in);
System.out.print("Enter the double number for calculate the area of circle or circumference:");
r=obj.nextDouble();
ar=3.14*r*r;
cr=2*3.14*r;
System.out.println("Area of circle:"+ar);
System.out.println("Circumference:"+cr);
}
}
