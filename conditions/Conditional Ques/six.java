
/*Write a program to accept an integer from user and print even if the number is even,
 Otherwise print odd.
 */
import java.util.Scanner;
public class six {
     public static void fun(int num)
     {
        if(num%2==0)
        {
            System.out.println("This is Even number:");
        }
        else if(num%2!=0){
            System.out.println("This is Odd number");
        }
     }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num=sc.nextInt();
        six s=new six();
        s.fun(num);
    }
}
