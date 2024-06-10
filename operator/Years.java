import java.util.Scanner;
class Years{
public static void main(String args[]){
Scanner rk=new Scanner(System.in);
System.out.print("Enter the Days:");
int raj=rk.nextInt();
int years=raj/365;
raj=raj%365;
System.out.println(years+" Years:");
int months=raj/30;
raj=raj%30;
System.out.println(months+" Months:");
int days=raj;
System.out.println(days+" Days:");
}
}

