import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int []arr=new  int[num];
        for(int i=0;i<num; ++i)
        {
            System.out.println("Enter the Elements:"+i);
            arr[i]=sc.nextInt();
        }
        for(int i=0; i<arr.length; ++i)
        {
            System.out.println(arr[i]);
        }
    }
}
