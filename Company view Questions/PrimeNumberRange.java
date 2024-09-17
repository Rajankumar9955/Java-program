public class PrimeNumberRange {
    public static void main(String[] args) {
        int start=10; int end=50;
        for(int num=start; num<=end; ++num)
        {
            boolean isprime=true;
            for(int i=2; i<=Math.sqrt(num); i++)
            {
                if(num%i==0)
                {
                    isprime=false;
                    break;
                }
            }
            if(isprime&&num>2)
            {
                System.out.print(num+" ");
            }
        }
    }
    
}
