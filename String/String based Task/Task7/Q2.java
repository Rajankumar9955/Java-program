
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s="00000123569";
        String str="";
        int c=0;
        for(int i=0; i<s.length(); ++i)
        {
            char ch=s.charAt(i);
            if(ch!='0')
            {
                    c=i;
                    break;
            }

        }
        str=s.substring(c, s.length());
        System.out.println(str);
    }
}
