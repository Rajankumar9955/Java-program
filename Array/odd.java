import java.util.Scanner;

public class odd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        int sum=0;
        for(int i=0; i<arr.length; ++i)
        {
            System.out.println("Enter the index"+i+":");
            arr[i]=sc.nextInt();
            if(arr[i]%2==0)
            {
                sum=sum+arr[i];
            }
        }
        System.out.println("sum oven number in array:"+sum);

    }
    
}
