import java.util.Scanner;

public class Avg {
    public static void main(String[] args) {
        int arr[]=new int[5];
        int sum=0;
        Scanner sc=new Scanner(System.in);
        for(int i=0; i<arr.length;++i)
        {
            System.out.println("Enter element index of "+ i+" :");
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
        }
        System.out.println("sum : "+sum);
        System.out.println("average: "+sum/arr.length);
    }
    
}
