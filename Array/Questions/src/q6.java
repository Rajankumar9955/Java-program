/*
Write a program to create an integer array by accepting the size of the array from user. Initialize the array by accepting values from user. Accept searchElement form the user and search for searchElement in the array. If element present in array print found otherwise not found.
Sample run
int[] numbers = {51, 100, 2, 8 , 45, 7};
int searchElement = 7;

Output
Found
* */

import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num=sc.nextInt();
        int []arr=new int[num];
        for(int i=0; i<num; ++i)
        {
            System.out.println("Enter the Elements:"+i);
            arr[i]=sc.nextInt();
        }
        System.out.println("What do you want to search:");
        int srch=sc.nextInt();
        for(int i=0; i<arr.length; ++i)
        {
            if(arr[i]==srch)
            {
                System.out.println("Found");
                break;
            }
            else
            {
                System.out.println("Not Found");

            }

        }
    }
}
