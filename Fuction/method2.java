//Taking nothing returning nothing

import java.util.Scanner;
class method2{
public static void evenodd(){
Scanner sc=new Scanner(System.in);
System.out.println("Enter any number:");
int num=sc.nextInt();
if(num%2==0){
System.out.println(num+":-This is Even number:");
}
else
{
System.out.println(num+":-This is Odd number:");
}
}
public static void main(String args[]){
  evenodd(); //calling of the evenodd function
 }
}
