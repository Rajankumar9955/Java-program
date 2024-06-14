import java.util.Scanner;
public class ques4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         String str = sc.nextLine();
         char c[]=str.toCharArray();
         if(str.length()==6)
         {
            System.out.println("This is string is");
         }
         else
         {
            System.out.println("This string should be in 6 charater");
         }
         for(int i=0; i<c.length; ++i)
         {
            if(c[i]>='A' && c[i]<='Z' || c[i]>='a' && c[i]<='z' || c[i]=='@')
            {
                System.out.println(c[i]);
            }
            else
            {
                System.out.println("This is string should be in charater or @");
                break;
            }

         }
         sc.close();
    }
    
}
