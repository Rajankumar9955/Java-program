/*Write a program to accept two numbers from user, if the both the numbers are positive, 
get the remainder of the division by 5 for both the numbers. If remainder of both the 
division are equal print numbers are equal, otherwise number are not equal. 
If one or both the numbers are negative, print calculation not possible. */


import java.util.Scanner;
public class Eight {
    public static void fun()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int num=sc.nextInt();
        System.out.println("Enter the second number:");
        int num1=sc.nextInt();
        if(num>0 && num1>0)
        {
            int rem=num/5;
            int rem1=num1/5;
            if(rem==rem1)
            {
                System.out.println("Number are equal");
            }
            else{
                System.out.println("Number are not equal");
            }
        }
        else
        {
            System.out.println("calculation not possible");
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        fun();
        
    }
}
