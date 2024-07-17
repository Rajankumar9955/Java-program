/*
 Q5. Swapping Pairs of Characters in a String in Java?
Input: str = “Java”
Output: aJav
Explanation: The given string contains even number of characters. Therefore,
we swap every pair of characters.
 */

import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.nextLine();
        char ch[]=str.toCharArray();
       
        for(int i=0; i<ch.length; i+=2)
        {
            if(ch.length%2!=0)
            {
                System.out.println("This is invalid choive");
                break;
            }
            else{
            char temp=ch[i];
            ch[i]=ch[i+1];
            ch[i+1]=temp;
            }
        }
        for(int i=0; i<ch.length; ++i)
        { 
            System.out.print(ch[i]);
        }
    }
}
