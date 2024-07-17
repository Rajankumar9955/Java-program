
/*Q1. Java Program to Add Characters to a String
Input:
Input custom string = Hello
Output:
--&gt; String to be added :'Ram';
--&gt; If end position, Output: HelloRam
--&gt; If in beginning, Output: RamHello
--&gt; If at sat 3rd index, Output: HelRamlo
*/

import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the word");
        String str=sc.nextLine();
        StringBuilder new_str=new StringBuilder(str);
        System.out.println("Enter the charater to add in string");
        // char ch=sc.next().charAt(0);
        String ch=sc.nextLine();
        System.out.println("Enter the position");
        int num=sc.nextInt();       
        new_str.insert(num,ch);
        System.out.println("Your output is:"+new_str);

    }
}
