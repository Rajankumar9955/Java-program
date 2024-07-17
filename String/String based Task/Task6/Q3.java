/*
 

Q3. Java Program to get a character from a
String?

Examples:
Input: str = &quot;hello&quot;, index = 3
Output: l
Input: str = &quot;welcoME to bhopal&quot;, index = 6
Output: E


 */
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(("Enter the string"));
        String str=sc.nextLine();
        System.out.println("Enter the charater");
        char c=sc.next().charAt(0);
        int v=0;
        for(int i=0; i<str.length(); ++i)
        {
             if(str.charAt(i)==c)
             {
                v++;
             }
        }
        System.out.println(v);
    }
}
