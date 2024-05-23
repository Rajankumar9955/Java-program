import java.util.Scanner;
class TaskFi{
public static void main(String args[]){
char ch;
System.out.println("Enter the charater");
Scanner rk=new Scanner(System.in);
ch=rk.next().charAt(0);
if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
{
System.out.println("This is vowel");
}
else if(ch=='b' || ch=='B')
{
System.out.println("This is constant");
}
else
{
System.out.println("wrong choice");
}
}
}


