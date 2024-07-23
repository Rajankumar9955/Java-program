

import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         String s="Geeks Gor Geeks";
         System.out.println("Enter the index number:");
         int ind=sc.nextInt();
         System.out.println("Enter the charater for replacing");
         char c=sc.next().charAt(0);
         System.out.println("original array:"+s);
         s=s.substring(0, ind)+c+s.substring(ind+1);
         System.out.println("after modified:"+s);
        
        }
        
}
