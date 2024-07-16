/*1. Write a program in java to find the largest and smallest word in a
string.
Test Data :
Input the string : It is a string with smallest and largest word.
Expected Output :
The largest word is :smallest;
and the smallest word is: a */


public class task1 {
    public static void main(String[] args) {
        String s= "It is a string with smallest and largest word.";
       String word[]=s.split(" ");
       String max=" ";
       String min=" ";
       for(int i=0; i<word.length; ++i)
       {
        if(word[i].length()>=max.length())
        {
            max=word[i];
        }
        if(word[i].length()<=min.length())
        {
            min=word[i];
        }
       }
       System.out.println("The largest word:"+max);
       System.out.println("The smallest word :"+min);
    }
}
