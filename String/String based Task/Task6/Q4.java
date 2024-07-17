
/*
 

Q4. Java Program to Convert String to String Array?
Example:

By Ram Lovewanshi
Input: String : "Welcome to Bhopal&quot";
Output: String[]: [Welcome to Bhopal]
Input: String : "A computer science portal";
Output: String[] : [A computer science portal]
 */
import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String st=sc.nextLine();
        String str[]=st.split(" ");
        for(int i=0; i<str.length; ++i)
        {
            System.out.print(str[i]);
        }
        sc.close();
    }
}
