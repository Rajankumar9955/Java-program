
/*
Write a program to create an integer array to store 5 integers. Accept the five integer values from user and print them on console.
* */


import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int []arr=new  int[num];
        for(int i=0;i<num; ++i)
        {
            System.out.println("Enter the Elements:"+i);
            arr[i]=sc.nextInt();
        }
        for(int i=0; i<arr.length; ++i)
        {
            System.out.println(arr[i]);
        }
    }
}
