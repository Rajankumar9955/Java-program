

import java.util.*;
public class FinalArray {
    

// Java Program to Illustrate Final Arrays
// Can Be Reassigned But Not Re-referred




    public static void main(String[] args)
    {

        final int[] arr = { 1, 2, 3, 4, 5 };

        arr[4] = 1;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}