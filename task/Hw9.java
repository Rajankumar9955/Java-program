import java.util.Scanner;
class Hw9{
public static void main(String args[]){
int num, first,last,sum,mul;
System.out.println("Enter the number:");
Scanner rk=new Scanner(System.in);
num=rk.nextInt();

last=num%10;
first=num/10;

sum=first+last;
mul=first*last; 
System.out.println("sum of : "+sum);
System.out.println("mul.. of : "+mul);
System.out.println("sum of digit and mul.. of digit: "+(sum+mul));

}
}