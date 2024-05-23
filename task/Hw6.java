import java.util.Scanner;
class Hw6{
public static void main(String args[]){
int a,sum=0;
System.out.println("Enter the number");
Scanner rk=new Scanner(System.in);
a=rk.nextInt();
for(int i=1; i<=a/2; i++)
{
  if(a%i==0)
{
System.out.print(i+" ");
sum=sum+i;
}
}
System.out.println("Sum of factor ="+ sum);
if(sum>a)
{
System.out.println(a+" is a abundant number ");
}
else
{
System.out.println(a+" is not abundant number ");
}
}
}