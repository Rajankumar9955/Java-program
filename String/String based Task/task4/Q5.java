
/*5. Write a program in java to Find the Frequency of Characters.
Test Data :
Input the string : This is a test string
Input the character to find frequency: i
Expected Output :
The frequency of &#39;i&#39; is : 3
*/

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s="This is a test string";
        int v=0;
        System.out.println("Enter the charter");
        char ch=sc.next().charAt(0);
        for(int i=0; i<s.length(); ++i)
        {
            if(ch==s.charAt(i))
            {
                v++;
            }
        }
        System.out.println("No of charater:"+v);
    }
}
