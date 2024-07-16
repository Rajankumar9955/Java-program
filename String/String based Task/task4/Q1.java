/*1. Write a C program to check whether a given substring is present in the
given string.
Test Data :
Input the string : This is a test string.
Input the substring to be search : search
Expected Output :
The substring is not exists in the string.
*/
import java.util.Scanner;
public class Q1 {
    
       public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s="This is a test string";
        String a[]=s.split(" ");
        System.out.println("Enter the word for search");
        String srch=sc.nextLine();
        for(int i=0; i<a.length; ++i)
        {
              if(a[i].equalsIgnoreCase(srch))
              {
                     System.out.println("This is valid");
                     break;
              }
              else{
                     System.out.println("This is not valid");
                     break;
              }
        }












       //  String str=sc.nextLine();
       //  for(int i=0; i<a.length; ++i)
       //  {
       //       if(a[i]==str)
       //       {
       //        System.out.println("This is exist in string");
       //       }
       //       else
       //       {
       //        System.out.println("This is not Exist in string");
       //       }
       //  }
        
       }



}
