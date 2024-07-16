/*   3. Write a program in java to find the number of times a given word 
appears in the given string.
Test Data :
Input the string : The string where the word the present more than once.
Expected Output :
The frequency of the word 'the' is : 3
*/
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s="The string where the word the present more than once";
        String sp[]=s.split(" ");
        int v=0;
        for(int i=0; i<sp.length; ++i)
        {
            if(sp[i].equalsIgnoreCase("the"))
            {
                v++;
            }
        }
       System.out.println("The frequency of the word 'the' is :"+v);
    }
    
}
