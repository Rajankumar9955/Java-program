public class FindNoX {
    static long solve(int[] a,
                int n)
{
    long res = 0, j = 0, one = 1;
 
    // For 64 Bit
    while (j < 64) 
    {
       
        // j is traversing each bit
        long Xor = 0;
        long powerOf2 = one << j;
 
        for (int x : a)
            Xor ^= x;
 
        if (j == 63 && (Xor & powerOf2)!=0)
            return -1;
 
        if ((Xor & powerOf2)!=0) {
            res += powerOf2;
            for (int i = 0; i < n; i++)
                a[i] += powerOf2;
        }
        j++;
    }
    return res;
}
 
// Driver Code
public static void main(String[] args)
{
 
    // Size of arr[]
    int N = 3;
    int[] arr = { 2, 4, 5 };
 
    System.out.print(solve(arr, N));
}
    
}
