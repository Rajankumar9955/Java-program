import java.util.HashMap;

public class logestRearranged {
    
  // function to check if the string can be
  // rearranged to a palindromic string or not
  static boolean ispalindromic(String s)
  {
 
    int n = s.length();
     
    // hashmap to count the frequency of
    // every character in given substring
    HashMap<Character,Integer>hashmap = new HashMap<Character,Integer>();
 
    for (int ch = 0; ch < n; ch++) {
      if(hashmap.containsKey(s.charAt(ch))){
        hashmap.put(s.charAt(ch), hashmap.get(s.charAt(ch))+1);
      }
      else hashmap.put(s.charAt(ch),1);
    }
 
 
    int count = 0;
 
    // Count of characters having odd frequency
    for(Character i : hashmap.keySet()){
      if (hashmap.get(i) % 2 == 1)
        count++;
    }
 
    // if count is greater than 1
    if (count > 1) {
      return false;
    }
 
    return true;
  }
   
  // Function to get the length of longest
  // substring whose characters can be
  // arranged to form a palindromic string
  static int longestSubstring(String S, int n)
  {
    int ans = 0;
 
    for (int i = 0; i < S.length(); i++) {
      String curstr = "";
      for (int j = i; j < S.length(); j++) {
 
        // Storing the substring
        curstr += S.charAt(j);
 
        // Checking if it is possible to
        // make it a palindrome
        if (ispalindromic(curstr)
            == true)
        {
 
          // Storing the maximum answer
          ans = Math.max(ans, j - i + 1);
        }
      }
    }
 
    return ans;
  }
 
  // Driver code
  public static void main (String[] args)
  {
 
    // Given String
    String s = "adbabd";
 
    // Length of given string
    int n = s.length();
 
    // Function call
    System.out.println(longestSubstring(s, n));
  }

}
