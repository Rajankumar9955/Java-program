import java.util.Scanner;
class NB4{
public static void main(String args[]){
Scanner rk=new Scanner(System.in);
System.out.println("Enter the number:");
int num=rk.nextInt();

if(num<3){
System.out.println("The digit should be greater than 3 digit :");
return;
}

int sum=3;
for(int i=3; sum<=num;i++)
{
  System.out.println(sum);
  sum += i;
}
}
}