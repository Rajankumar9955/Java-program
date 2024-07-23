/*Replace a character at a specific index in a
String in Java

Examples of Replacing Characters in a String
Input: String = "Geeks Gor Geeks", index = 6, ch = 'F'
Output: "Geeks For Geeks."

Input: String = "Geeks", index = 0, ch = 'g'
Output: "geeks"
 */

// import java.util.Scanner;
// public class Q1 {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//          String s="Geeks Gor Geeks";
//          System.out.println("Enter the index number:");
//          int ind=sc.nextInt();
//          System.out.println("Enter the charater for replacing");
//          char c=sc.next().charAt(0);
//          System.out.println("original array:"+s);
//          s=s.substring(0, ind)+c+s.substring(ind+1);
//          System.out.println("after modified:"+s);
        
//         }
        
// }


import java.util.Scanner;
public class Q1{
    public static void ReplaceChar(String s,int ind, char c)
    {
            s=s.substring(0,ind)+c+s.substring( ind+1);
            System.out.println("Your Output is:"+s);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Q1 obj=new Q1();
        System.out.println("Enter the String");
        String s=sc.nextLine();
        System.out.println("Enter the index for Replacing");
        int ind=sc.nextInt();
        System.out.println("Enter the charater for replacing");
        char c=sc.next().charAt(0);
        obj.ReplaceChar(s, ind, c);
    }
}
