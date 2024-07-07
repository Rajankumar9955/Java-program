import java.util.Scanner;
class Vowel{
public static void main(String args[]){
char a;
Scanner rk=new Scanner(System.in);
System.out.println("Enter the any character:");
a=rk.next().charAt(0);
if(a=='a' || a=='e' || a=='i' || a=='o' || a=='u')
{
System.out.println(a+" is vowel");
}
else
{
System.out.println(a+" is consonat");
}
}
}

