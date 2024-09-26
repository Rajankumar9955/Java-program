/*
 logest substring with same name
 */

public class LogestSubstrwithsameName {
    public static int Substring(String s)
    {
        int ans=1,temp=1;
        for(int i=1; i<s.length(); i++)
        {
            if(s.charAt(i)==s.charAt(i-1))
            {
                ++temp;
            }
            else{
                ans=Math.max(ans, temp);
                temp=1;
            }
        }
        ans=Math.max(ans, temp);
        return ans;
    }
    public static void main(String[] args) {
        String s="abcddddeff";
        System.out.println(Substring(s));
    }
}
