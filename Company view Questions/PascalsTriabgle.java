public class PascalsTriabgle {
    public static void main(String[] args) {
        int rows=5;
        for(int i=0; i<rows; i++)
        {
            int num=1;
            System.out.format("% "+(rows-i)*2+"s","");
            for(int j=0; j<=i; ++i)
            {
                System.out.format("%4d",num);
                num=num*(i-j)/(j+1);
                
            }
System.out.println();
        }

    }
}
