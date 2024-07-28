/*
 Write a program to accept an integer from user and print positive, if the number is positive. 
 Otherwise, print negative. Considering number can never be equal to zero.
 */
import java.util.Scanner;
public class fifth {
    public static void fun(int num)
    {
        if(num<0)
        {
            System.out.println("This is negative number:"+num);
        }
        else if(num==0)
        {
            System.out.println("This is zero:"+num);
        }
        else
        {
            System.out.println("This is positive number:"+num);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num=sc.nextInt();
        fifth fh=new fifth();
        fh.fun(num);
    }
    
}
