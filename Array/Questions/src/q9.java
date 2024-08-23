
/*
Write a program to create an integer array by accepting the size of the array from user. Initialize the array by accepting values from user. Find the index of minimum and maximum element from the array and print it on console.
Sample run
int[] numbers = {51, 100, 2, 8 , 45, 7};
indexOfMinimumElement = 2
indexOfMaximumElement = 1
* */

import java.util.Scanner;

public class q9 {
     static  int[] arr = {51, 100, 2, 8 , 45, 7};

    public static int Largest()
    {
        int max=arr[0];
         for(int i=0; i<arr.length; ++i)
         {
             if(arr[i]>max)
             {
                 max=arr[i];
             }
         }
         return  max;
    }
    public static int smallest()
    {
        int min=arr[0];
        for(int i =0; i<arr.length;++i)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        return  min;
    }
    public static void main(String[] args) {
        System.out.println("Max Element:"+Largest());
        System.out.println("Min Element:"+smallest());

    }
}
