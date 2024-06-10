import java.util.Scanner;
class NB5{
public static void main(String args[]){
int num,origin,remain,res=0;
System.out.println("Enter the number:");
Scanner rk=new Scanner(System.in);
num=rk.nextInt();
 
origin=num;
while(origin>0)
{
 remain=origin%10;
 res +=Math.pow(remain,3);
 origin /=10;
}
if(res==num)
{
 System.out.println(num+ " is an Armstrong number");
}
else
{
System.out.println(num+" is not an Armstrong number:");
}
}
}
