/*Write a program to accept an integer from user. If the number is even make it odd and print. 
If the number is odd make it even and print.
 */
import java.util.Scanner;
public class Seven {
    public static void fun(int num)
    {
        if(num%2==0)
        {
            num=num+1;
            System.out.println("First is even and second time odd:"+num);
        }
        else if(num%2!=0)
        {
           num=num+1;
           System.out.println("First is odd and second time even:"+num);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Seven sb=new Seven();
        System.out.println("Enter teh number:");
        int num=sc.nextInt();
        sb.fun(num);
    }
}
