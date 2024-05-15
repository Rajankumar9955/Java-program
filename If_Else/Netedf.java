//nested if
import java.util.Scanner;
class NestedIf{
public static void main(String args[]){
char c;
Scanner rk=new Scanner(System.in);
System.out.println("Enter the any charater");
c=rk.next().charAt(0);
if(c>='a')
{
  if(c<='z')

{
     System.out.println(c+" This is lower case");
}
}else if(c>='A')
{
   if(c<='Z')
{
 System.out.println(c+" This is upper case");
}
}
}
}