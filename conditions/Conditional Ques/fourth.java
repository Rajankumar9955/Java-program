/*Write a program to accept three numbers from user and print all are divisible by 9,
 if all three numbers are divisible by 9. */
import java.util.Scanner;
public class fourth {
    public static void fun(int n,int n1,int n2)
    {
        if(n%9==0 && n1%9==0 && n2%9==0)
        {
            System.out.println("All are divisible by 9");
        }
        else
        {
            System.out.println("All are not divisible by 9");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1=sc.nextInt();
        System.out.println("Enter the second number:");
        int num2=sc.nextInt();
        System.out.println("Enter teh third number:");
        int num3=sc.nextInt();
        fourth fr=new fourth();
        fr.fun(num1,num2,num3);
    }
}
