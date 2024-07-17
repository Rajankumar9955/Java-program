/*1. Write a program in java to compare two strings
Test Data :
Check the length of two strings:
--------------------------------
Input the 1st string : aabbcc
Input the 2nd string : abcdef
String1: aabbcc
String2: abcdef
Expected Output : Strings are not equal.
Check the length of two strings:
--------------------------------
Input the 1st string : aabbcc
Input the 2nd string : aabbcc
String1: aabbcc
String2: aabbcc
Expected Output : Strings are equal.
 */
import java.util.Scanner;
public class Q1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first array");
        String n=sc.nextLine();
       
        
        System.out.println("Enter the second array");
        String s=sc.nextLine();
        
        

        if(n.equals(s))
        {
            System.out.println("String are equal:");
        }
        else
        {
            System.out.println("String are not Equal:");
        }
       

        sc.close();

    }
}
