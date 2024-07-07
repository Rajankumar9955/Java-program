/*5.  Write a program in java to split string by space into words.
Test Data :
Input a string : this is a test string
Expected Output :
Strings or words after split by space are :
this
is
a
test
string
*/

public class q5 {
    public static void main(String[] args) {
        String s="this is a test string";
        String c[]=s.split(" ");
      
        for(int i=0; i<c.length; ++i)
        {
            System.out.println(c[i]);
        }
    }
    
}
