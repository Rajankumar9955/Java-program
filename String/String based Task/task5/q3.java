/*3. Write a program in java to convert a string to lowercase without using
pre-defined function
Test Data :
Input a string in UPPERCASE : THE QUICK BROWN FOX JUMPS
OVER THE LAZY DOG.
Expected Output :
Here is the above string in lowercase :
the quick brown fox jumps over the lazy dog.
*/

public class q3 {
    public static void main(String[] args) {
        String s= "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.";
        char ch[]=s.toCharArray();
        for(int i=0; i<ch.length; ++i)
        {
           if(ch[i]>='A' && ch[i]<='Z')
           {
            ch[i]=(char)(ch[i]+32);
           }
        }
        s=new String(ch);
        System.out.println(s);

    }
    
}
