
public class fifth {
    static int nthTerm(int n)
{
 
    //return the final sum
    return 6 * (int)Math.pow(n, 2) - 4 * n - 2;
}
 
// Driver code
public static void main(String arr[])
{
    int N = 4;
 
    System.out.println(nthTerm(N));
 
}
}
