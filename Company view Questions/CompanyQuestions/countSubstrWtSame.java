public class countSubstrWtSame {
    public static boolean checkEquility(String s)
    {
        return(s.charAt(0)==s.charAt(s.length()-1));
        
    }
    static int countSubstringWithEqualEnds(String s)
    {
        int result =0;
        int n=s.length();
        for(int i=0; i<n; i++)
        {
            for(int len=1; len<=n-i; len++)
            {
                 if(checkEquility(s.substring(i,i+len)))
                 {
                    result++;
                 } 
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String s="abcab";
        System.out.println(countSubstringWithEqualEnds(s));
    }
}
