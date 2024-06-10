//print table
import java.util.scanner;
class Table{
public static void main(String args[]){
int a;
Scanner rk=new Scanner(System.in);
a=rk.nextInt();
System.out.println("Enter any number:");
for(int i=1; i<=10; ++i){
System.out.println(a*i);
}
}
}