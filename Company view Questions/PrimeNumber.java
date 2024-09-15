
public class PrimeNumber {
    public static void main(String[] args) {
        int num=11;
        boolean isprime=true;
        for(int i=2; i<=Math.sqrt(num); ++i)
        {
            if(num%i==0)
            {
                isprime=false;
                break;
            }
        }
        System.out.println(isprime);
    }
}
