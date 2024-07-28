/*Write a program to accept three numbers from user and print equals if the numbers are equal. */
import java.util.Scanner;
public class third {
    public static void fun(int n1,int n2,int n3)
    {
           if((n1==n2)&& (n2==n3))
           {
                System.out.println("All are equal");
           }
           else
           {
            System.out.println("All are Different");
           }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int num1=sc.nextInt();
        System.out.println("Enter the second number");
        int num2=sc.nextInt();
        System.out.println("Enter the third number");
        int num3=sc.nextInt();
        fun(num1,num2,num3);
       }
}
