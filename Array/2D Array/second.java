
import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        int arr[][]=new int[3][3];
        Scanner sc=new Scanner(System.in);
        int r,c;
        for(r=0; r<3; ++r)
        {
            for(c=0; c<3; ++c)
            {
                System.out.println("Enter element index:"+r+c);
                arr[r][c]=sc.nextInt();
            }
        }
        System.out.println("Array elements are:");
        for(r=0; r<3; ++r)
        {
            for(c=0; c<3; ++c)
            {
                System.out.print("\t"+arr[r][c]);
            }
            System.out.println("");
        }
    }
    
}
