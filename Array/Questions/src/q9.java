
/*
Write a program to create an integer array by accepting the size of the array from user. Initialize the array by accepting values from user. Find the index of minimum and maximum element from the array and print it on console.
Sample run
int[] numbers = {51, 100, 2, 8 , 45, 7};
indexOfMinimumElement = 2
indexOfMaximumElement = 1
* */

import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num=sc.nextInt();
        int []arr=new int[num];
        int mx=arr[0];
        int mn=arr[0];
        for(int i=0; i<num; ++i)
        {
            System.out.println("Enter the Elements:");
            arr[i]=sc.nextInt();
        }
        for(int i=0; i<arr.length; ++i)
        {
              if(arr[i]>mx) {
                  mx = arr[i];
                  System.out.println("max Position:"+i);
                  break;
              }
        }
        for(int i=0; i<arr.length; ++i)
        {
            if(arr[i]<arr[i+1])
            {
                mn=arr[i];
                System.out.println("min Position"+i);
            }
        }
    }
}
