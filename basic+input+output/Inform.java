import java.util.Scanner;
class Inform{
    public static void main(String args[]){
   Scanner rk=new Scanner(System.in);
 System.out.println("Enter Name: ");
 String name=rk.nextLine();
System.out.println("Enter section: ");
char s=rk.next().charAt(0);
System.out.println("Enter Address: ");
String ad=rk.next();

System.out.println("Name:"+name);
System.out.println("Section:"+s);
System.out.println("Address:" +ad);
 }
} 