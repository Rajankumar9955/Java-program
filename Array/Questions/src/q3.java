/*
Write a program to create an integer array and initialize it with values {51, 100, 2, 8 , 45, 7}. Print all the even element of the array.
* */

public class q3 {
    public static void main(String[] args) {
        int []arr={51, 100, 2, 8 , 45, 7};
        for(int i=0; i<arr.length; ++i)
        {
            if(arr[i]%2==0)
            {
                System.out.println(arr[i]);
            }
        }
    }
}
