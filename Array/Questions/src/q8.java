
/*
Write a program to create an integer array by accepting the size of the array from user. Initialize the array by accepting values from user. Find the minimum element from the array and print it on console.
Sample run
int[] numbers = {51, 100, 2, 8 , 45, 7};
minimum = 2
* */


import java.util.Scanner;
public class q8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num=sc.nextInt();
        int []array=new int[num];
        int min=array[0];
        for(int i=0;i<num; ++i)
        {
            System.out.println("Enter the Elements:");
            array[i]=sc.nextInt();
        }
        for(int j=0; j<array.length;++j)
        {
            if(min>array[j])
            {
                min=array[j];
            }
        }
        System.out.println(min);
    }
}
