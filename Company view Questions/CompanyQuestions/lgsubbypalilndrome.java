import java.util.Arrays;

public class lgsubbypalilndrome {
    public static int longestSubstring(String s)
    {
        // Initialize dp array of size 1024
        int dp[] = new int[1024];
 
        // Initializeing dp array with length of s
        Arrays.fill(dp, s.length());
 
        // Initializing mask and res
        int res = 0, mask = 0;
        dp[0] = -1;
 
        // Traverse the string
        for (int i = 0; i < s.length(); ++i) {
 
            // Find the mask of the current character
            mask ^= 1 << (s.charAt(i) - '0');
 
            // Finding the length of the longest
            // substring in s which is a
            // palindrome for even count
            res = Math.max(res, i - dp[mask]);
 
            // Finding the length of the longest
            // substring in s which is a
            // palindrome for one odd count
            for (int j = 0; j <= 9; ++j)
 
                // Finding maximum length of
                // substring having one odd count
                res = Math.max(res,
                               i - dp[mask ^ (1 << j)]);
 
            // dp[mask] is minimum of
            // current i and dp[mask]
            dp[mask] = Math.min(dp[mask], i);
        }
 
        // Return longest length of the substring
        // which forms a palindrome with swaps
        return res;
    }
 
    // Driver Code
    public static void main(String[] args)
    {
        // Input String
        String s = "3242415";
 
        // Function Call
        System.out.println(longestSubstring(s));
    }

}
