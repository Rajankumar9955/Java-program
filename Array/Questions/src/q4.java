/*
Write a program to create an integer array and initialize it with values {51, 100, 2, 8 , 45, 7}. Increase the value of all the odd elements of the array and decrease the value of all the even elements of the array.
* */
public class q4 {
    public static void main(String[] args) {
        int []arr={51, 100, 2, 8 , 45, 7};
        for(int i=0; i<arr.length; ++i)
        {
            if(arr[i]%2==0)
            {
                arr[i]--;
            }
            else if(arr[i]%2!=0)
            {
                arr[i]++;
            }
        }
        for(int i=0; i<arr.length; ++i)
        {
            System.out.println(arr[i]);
        }
    }
}
