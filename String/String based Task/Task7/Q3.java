/*Q3.Java Program to Reverse a String using Stack?

Input: Hello World
Output: <- Reverse -> dlroW olleH
 */

 import java.util.Scanner;
public class Q3 {
    String str[] = new String[1];
    int top=-1;
    public void push(String s)
    {
        if(top==str.length-1)
        {
            System.out.println("over flow condition");
        }
        else{
            top++;
            str[top]=s;
        }
    }
    public void show()
    {
        if(top==-1)
        {
            System.out.println("stack is empty");
        }
       
            for(int i=str[0].length()-1; i>=0; i--)
            {
                      System.out.print(str[0].charAt(i));
            }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Word for Reverse:");
        String s=sc.nextLine();
        Q3 q=new Q3();
        q.push(s);
        q.show();
    }
}
