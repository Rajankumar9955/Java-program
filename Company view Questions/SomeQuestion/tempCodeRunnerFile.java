
public class one {
    public static int NthTerm(int n)
    {
        return 2*(int)Math.pow(n,2)+3*n-5;

    }
    public static void main(String[] args) {
        int N=5;
        System.out.println(NthTerm(N));
    }
}