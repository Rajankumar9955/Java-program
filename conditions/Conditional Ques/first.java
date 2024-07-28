/*Write a program that accept an integer form user and print positive, if the integer is positive. */

import java.util.Scanner;
public class first {
    public static void fun(int num)
    {
              if(num<=0)
              {
                System.out.println("This is negative number:"+num);
              }
              else
              {
                System.out.println("This is the positive number:"+num);
              }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number for checking");
        int num=sc.nextInt();
        fun(num);
        
    }
}
