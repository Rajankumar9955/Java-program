public class A {
    public static void main(String[] args) {
        int n=5;
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=9; j++)
            {
               if((j==6-i) || (i==3&&j<=7)||(j==4+i)){
                System.out.print("*");
               }
               else
               {
                System.out.print(" ");
               }
            }
            System.out.println();
        }

    }
}
