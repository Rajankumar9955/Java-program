
/*



Q2. Java Program to Iterate Over Characters in
String?

Input : str = “welcometobhopal”
Output : w e l c o m e t o b h o p a l
Input : str = &quot;RAM&quot;
Output : R A M


 */



import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.nextLine(); 
        char ch[]=str.toCharArray();
        for(int i=0; i<ch.length; ++i)
        {
            System.out.print(ch[i]);
        //     char ch=str.charAt(i);
        //    System.out.print(ch);
        }
;    }
}
