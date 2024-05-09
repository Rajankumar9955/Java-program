import java.util.Scanner;
class Emp{
public static void main(String args[]){
Scanner rk=new Scanner(System.in);
System.out.println("Enter employee name:");
String name=rk.nextLine();
System.out.println("Enter salary:");
float salar=rk.nextFloat();
rk.nextLine();
System.out.println("Enter job profile:");
String job=rk.nextLine();
System.out.println("Enter EMP no:");
int em=rk.nextInt();
System.out.println("Enter department no:");
int dp=rk.nextInt();
System.out.println("Enter Grade:");
char gd=rk.next().charAt(0);
System.out.println("Emp.Name:"+name);
System.out.println("salary:"+salar);
System.out.println("job profile:"+job);
System.out.println("Emp no:"+em);
System.out.println("department no:"+dp);
System.out.println("Grade:"+gd);
}
}
