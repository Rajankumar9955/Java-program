
/*
Write a program to create an integer array by accepting the size of the array from user. Initialize the array by accepting values from user. Accept searchElement form the user and search for searchElement in the array. If element present in array print the index on which it is present otherwise print -1.
Sample run1
int[] numbers = {51, 100, 2, 8 , 45, 7};
int searchElement = 7;

Output
index = 5

Sample run2
int[] numbers = {51, 100, 2, 8 , 45, 7};
int searchElement = 10;

Output
index = -1
* */
import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
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
                System.out.println("Searched Element Position:"+i);
            }
            else
            {
                System.out.println("index:-1");
            }
        }
    }
}
