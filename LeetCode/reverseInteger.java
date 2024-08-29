package LeetCode;

import java.util.Scanner;

public class reverseInteger {
    public static int reverseInt( int n)
    {
          int reverse=0;
          int con;
          while (n!=0) {
            con=n%10;
            n=n/10;
            if(reverse>Integer.MAX_VALUE/10 || reverse < Integer.MIN_VALUE/10)
            {
                return 0;
            }
            reverse=(reverse*10)+con;
          }
          return reverse;
    }
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Interger:");
    int num=sc.nextInt();
    reverseInt(num);

    int reverseNum=reverseInt(num);
    System.out.println("After reversed:"+reverseNum);
    sc.close();
   }
}
