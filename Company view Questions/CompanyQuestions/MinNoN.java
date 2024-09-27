public class MinNoN {
    static int INF = 99999;
static int size = 10;
 
// Function to count sum of set bits
// of all numbers till N
static int getSetBitsFromOneToN(int N)
{
    int two = 2, ans = 0;
    int n = N;
 
    while (n!=0) {
        ans += (N / two) * (two >> 1);
 
        if ((N & (two - 1)) > (two >> 1) - 1)
            ans += (N & (two - 1)) - (two >> 1) + 1;
 
        two <<= 1;
        n >>= 1;
    }
    return ans;
}
 
// Function to find the minimum number
static int findMinimum(int x)
{
    int low = 0, high = 100000;
 
    int ans = high;
 
    // Binary search for the lowest number
    while (low <= high) {
 
        // Find mid number
        int mid = (low + high) >> 1;
 
        // Check if it is atleast x
        if (getSetBitsFromOneToN(mid) >= x) {
            ans = Math.min(ans, mid);
            high = mid - 1;
        }
        else
            low = mid + 1;
    }
 
    return ans;
}
 
// Driver Code
public static void main(String args[])
{
    int x = 20;
    System.out.println(findMinimum(x));
 
}
    
}
