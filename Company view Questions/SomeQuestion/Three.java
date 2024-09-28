
public class Three {
    public static int nthTerm(int N)
    {
        return (2*N+3)*(2*N+3)-2*N;
    }
    public static void main(String[] args) {
        int N=4;
        System.out.println(nthTerm(N));
    }
}
