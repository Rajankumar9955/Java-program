/*Write a Java program to convert a given integer (in seconds) to hours, minutes and second;*/

import java.util.Scanner;
class HMS{
public static void main(String args[]){
Scanner rk=new Scanner(System.in);
System.out.println("Enter the second: ");
int second=rk.nextInt(); //25300
int a=second%60; //second complete
int hours=second/60;   
int minutes= hours%60;
hours=hours/60;

System.out.println("Time:"+hours+":"+minutes+":"+a);
}
}