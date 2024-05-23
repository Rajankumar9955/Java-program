import java.util.Scanner;
class Hw7{
public static void main(String args[]){
int num,last,slast,first,sum;
System.out.println("enter the number:");
Scanner rk=new Scanner(System.in);
num=rk.nextInt();

 last=num%10;
 slast=(num%100)/10;
 first=(num/100)%10;

sum=first+slast+last;
System.out.println("sum of digit "+ sum);
if(num%sum==0)
{
System.out.println(num+" is divisible by "+sum);
}
else 
{
System.out.println(num+" is not divisible by "+sum);
}
}
}