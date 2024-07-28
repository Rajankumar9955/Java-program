
/*Write a program that accept two numbers from the user and print equals if the numbers are equal. */
import java.util.Scanner;
public class second {
    public static void fun(int num1,int num2)
    {
        if(num1==num2)
        {
            System.out.println("This is Equal numbers");
        }
        else
        {
            System.out.println("This is not Equal");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1=sc.nextInt();
        System.out.println("Enter the second number");
        int num2=sc.nextInt();
        fun(num1,num2);
    }
}
