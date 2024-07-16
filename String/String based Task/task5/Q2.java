/*2.  Write a program in java to convert a string to uppercase without using
pre-defined function  
Test Data :
Input a string in lowercase : the quick brown fox jumps over the lazy dog
Expected Output :
Here is the above string in UPPERCASE :
THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.*/

public class Q2 {
   public static void main(String[] args) {
    String str="the quick brown fox jumps over the lazy dog Expected Output";
    char ch[]=str.toCharArray();
     for(int i=0; i<ch.length; ++i)
     {
        if(ch[i]>='A' && ch[i]<='Z')
        {
            ch[i]=(char)(ch[i]-32);
        }
     }
       str=new String(ch);
       System.out.println(str);
   }
}
