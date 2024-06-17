//nested if
import java.util.Scanner;
class NestedIf{
public static void main(String args[]){
int c;
Scanner rk=new Scanner(System.in);
System.out.println("Enter the any charater");
c=rk.next().charAt(0);
if(c>='a'){
if(c>='z'){
System.out.println("This is vowel charater");
}
}
else if(c>='A'){
if(c>='Z'){
System.out.println("This is consonant");
}
}
}
}