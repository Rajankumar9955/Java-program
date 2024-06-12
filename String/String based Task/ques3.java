import java.util.Scanner;
public class ques3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char c[]=str.toCharArray();
        if(str.length()==5)
        {
            System.out.println("String is:");
        }
        else
        {
            System.out.println("String should be in 5 character");
        }
        for(int i=0; i<c.length; ++i)
        {
            if(c[i]>='1' && c[i]<='9')
            {
                System.out.println(c[i]);
            }
            else
            {
                System.out.println("The charater should be in digit");
                break;
            }
        }
    }
    
}
