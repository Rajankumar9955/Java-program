//Q1. Write a java program to print second last digit of the given number.
//Enter Any Number : 1234

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

//output:=3
