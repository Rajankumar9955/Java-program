/*
Write a program to create an integer array and initialize it with values {51, 100, 2, 8 , 45, 7}. Print the size of array using length property of array and also calculate and print the sum and average of all the elements of the array.
* */

public class q2 {
    public static void main(String[] args) {
        int []arr={51, 100, 2, 8 , 45, 7};
        int size=arr.length;
        int val=0;
        for(int i=0; i<arr.length; ++i)
        {
            val=val+arr[i];    //val+=arr[i];
        }
        System.out.println("size:"+size);
        System.out.println("Total Value:"+val);
        int avg=val/size;
        System.out.println("Average of the array:"+avg);
    }
}
