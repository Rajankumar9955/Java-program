
public class Q3 {
    public static void main(String[] args) {
        String s= new String("Welcome to w3resource.com");
        int v=0;
        int c=0;
        char ch;
        for(int i=0; i<s.length(); ++i)
        {
              ch=s.charAt(i);
              if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='I' || ch=='E' || ch=='O' || ch=='U')
              {
                v++;
              }
              else if(ch>='1' && ch<='9')
              {

              }
              else 
              {
                c++;
              }
        }
        System.out.println("The total number of vowel in the string is:"+v);
        System.out.println("The total number of constant in the string is:"+c);
    }
    
}
