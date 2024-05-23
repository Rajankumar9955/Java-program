import java.util.Scanner;
class QuesTh{
public static void main(String args[]){
int n;
System.out.println("Enter the number");
Scanner rk=new Scanner(System.in);
n=rk.nextInt();
if(n%2==0)
{
System.out.println(n+" is a even number");
}
else 
{
System.out.println(n+" is a odd number");
}

}
}