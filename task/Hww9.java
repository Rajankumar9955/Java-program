import java.util.Scanner;
class Hww9{
public static void main(String args[]){
int num,first;
System.out.println("Enter the number:");
Scanner rk=new Scanner(System.in);
num=rk.nextInt();

first=(num/100)/10;

if(first==0)
{
System.out.println("is not Duck number:");
}
else
{
System.out.println(num+" is a Duck number");
}
}
}


