
public class Q2 {
    public static void main(String args[])
    {
       
        String s=new String("Welcome to w3resource.com");
       
        int c=0;
        int num=0;
        int spl=0;
        char ch;
        for(int i=0; i<s.length(); ++i)
        {
             ch=s.charAt(i);
            if(ch>='a' && ch<='z')
            {
                  c++;
            }
            else if(ch>='1' && ch<='9')
            {
                num++;
            }
            else 
            {
                spl++;
            }
                
            
        }
        System.out.println("Number of Alphabets in the string is :"+c);
        System.out.println("Number of Digits in the string is :"+num);
        System.out.println("Number of Special characters in the string is :"+spl);
        
        
    }
}
