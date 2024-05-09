//Write a program to calculate area and parameter Rectangle?

import java.util.Scanner;
class Circum{
    public static void main(String args[]){
    int l,b,ar,pr;
    Scanner kb=new Scanner(System.in);
    System.out.println("Enter the length:");
    l=kb.nextInt();
    System.out.println("Enter the breath:");
    b=kb.nextInt();
    ar=l*b;
    pr=2*(l+b);
    System.out.println("Area of Rectangle:"+ar);
    System.out.println("Pirameter of Rectagle:"+pr);

   }
}
    