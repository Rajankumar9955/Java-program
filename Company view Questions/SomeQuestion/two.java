
public class two {
    public static void NthTerm(int n)
    {
        int numerator=((int)Math.pow(n,2))-1;
        int denominator=2*n-3;
        System.out.println(numerator + "/" + denominator);
    }
    public static void main(String[] args)
    {
        int n=3;
        NthTerm(n);
    }
}
