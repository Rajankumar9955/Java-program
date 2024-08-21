/*
Write a program to create an integer array by accepting the size of the array from user. Initialize the array by accepting values from user. Find the maximum element from the array and print it on console.
Sample run
int[] numbers = {51, 100, 2, 8 , 45, 7};
maximum = 100
*/

public class q5 {
    public static void main(String[] args) {
        int []arr={51, 100, 2, 8 , 45, 7};
        int max=arr[0];
        for(int i=0; i<arr.length; ++i)
        {
            if(arr[i]>max)
            {
               max=arr[i];
                System.out.println(max);
            }

        }

    }
}
