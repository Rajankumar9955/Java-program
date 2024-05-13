import java.util.Scanner;
class Years{
public static void main(String args[]){
Scanner rk=new Scanner(System.in);
System.out.print("Enter the Days:");
int days=rk.nextInt();
int years=days/365;
int months=years%30;
int days=months/30;

System.out.print("Time:"+years+":"+months+":"+days);
}
}

