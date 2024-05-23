import java.util.Scanner;
class Hw8{
public static void main(String args[]){
int num,first,sec,slast,last,sum,mul;
System.out.println("Enter the number:");
Scanner rk=new Scanner(System.in);
num=rk.nextInt(); 

last=num%10;  
slast=(num%100)/10;
sec=(num/100)%10;
first=(num/100)/10; 
sum=first+sec+slast+last;
mul=first*sec*slast*last;
System.out.println("Sum of that's digit "+sum);
System.out.println("Multi... of that's number "+mul);
if(sum==mul)
{
System.out.println("This is spy number");
}
else 
{
System.out.println("This is not spy number");
}
}
}