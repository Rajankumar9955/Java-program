import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many Hamming to print");
        int n=sc.nextInt();
        for(int i=1; i<n; ++i)
        {
            if(i%2==0 || i%3==0 || i%5==0)
            {
                System.out.print("\t"+i);
            }
        }
    }
   
}
