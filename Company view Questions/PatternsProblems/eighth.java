package PatternsProblems;

public class eighth {
    public static void main(String[] args) {
        int n=5;
        for(int i=1; i<=n; i++)
        {
            for(int j=i; j<n; j++)
            {
                System.out.print(" ");
            }
            for(int j=1; j<=(2*i-1); j++)
            {
                if(j==1 || j==(2*i-1) || i==n)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            
        }
    }
    
}
