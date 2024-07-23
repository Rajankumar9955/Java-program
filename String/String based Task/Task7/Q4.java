/*Sort a String in Java

Input string : "axbycz"
Output string : "abcxyz"
Input: str = “GeeksForGeeks”
Output: No
Explanation: The given string does not contain all the letters from a to z
(ignoring case).
 */
import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
            s=s.toLowerCase();
        char ch[]=s.toCharArray();
        String res="";
        for(int i=0; i<ch.length; ++i)
        {
            for(int j=i+1; j<ch.length; ++j)
            {
                if(ch[i]>=ch[j])
                {
                    char temp=ch[i];
                    ch[i]=ch[j];
                    ch[j]=temp;
                }
            }
            res+=ch[i];
        }
       
          System.out.println(res);
       
    }
}
