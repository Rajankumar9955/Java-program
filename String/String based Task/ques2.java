import java.util.Scanner;
public class ques2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char c[]=str.toCharArray();
        if(c.length>=3)
        {
            System.out.println("String  is: ");
        }
        else
        {
            System.out.println("String should be atleast 3 character");
        }
        for(int i=0; i<c.length; ++i)
        {
           if(c[i]>='A' && c[i]<='Z' || c[i]>='a' && c[i]<='z')
           {
            System.out.println(c[i]);
           }
           else
           {
            System.out.println("string should be alphabet");
            break;
           }
        }
        sc.close(); 
    }
    
}
