/*
 
2. Write a program in java to read a sentence and replace lowercase
characters by uppercase and vice-versa. 
Test Data :
Input the string : This Is A Test String.
Expected Output :
The given sentence is : This Is A Test String.
After Case changed the string is: tHIS iS a tEST sTRING.


 */

import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the words");
        String s=sc.nextLine();
        String x="";
        for(int i=0; i<s.length(); ++i)
        {
           char ch=s.charAt(i);
           if(Character.isUpperCase(ch))
           {
             x+=Character.toLowerCase(ch);
           }
           else{
             x+=Character.toUpperCase((ch));
           }
        }
        System.out.println("This Is A Test String:"+s);
        System.out.println("After Case changed the string is:"+x);
    }
   

}
