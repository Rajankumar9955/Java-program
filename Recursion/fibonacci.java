
public class fibonacci {
    public static void fibo(int n)
    {
        int a=0,b=1;
        System.out.print("\t"+a+"\t"+b);
        for(int i=2; i<=n; ++i)
        {
            int c=a+b;
            System.out.print("\t"+c);
            a=b;
            b=c;
        }
    }
    public static void main(String args[]){
         fibo(8);
    }
}
