/*4. Write a program in java to remove characters in String Except
Alphabets.
Test Data :
Input the string : wel123come456india
Expected Output :
After removing the Output String : welcomeindia
*/import java.util.Scanner;;
public class Q4 {
    public static void main(String[] args) {
        String s=" wel123come456india";
        String ch=" ";
        for(int i=0; i<s.length(); ++i)
        {
            if(s.charAt(i)>=65 && s.charAt(i)<=122)
            {
                 ch+=s.charAt(i);
            }
        }
        System.out.println(ch);
    }
}
