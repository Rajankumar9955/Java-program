//switch case
import java.util.Scanner;
class SwitchCase{
public static void main(String args[]){
char c;
Scanner rk=new Scanner(System.in);
System.out.println("Enter any characte");
c=rk.next().charAt(0);

switch(c){
case 'a':
case 'A':
System.out.println("It is a vowel");
case 'e':
case 'E':
System.out.println("It is a vowel");

case 'i':
case 'I':
System.out.println("It is a vowel");

case 'o':
case 'O':
System.out.println("It is a vowel");

case 'u':
case 'U':
System.out.println("It is a vowel");

default : 
System.out.println("This is not vowel");

}
}
}