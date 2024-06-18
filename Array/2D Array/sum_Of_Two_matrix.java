import java.util.Scanner;
public class sum_Of_Two_matrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int A[][]=new int[3][3];
        int B[][]=new int[3][3];
        int C[][]=new int [3][3];
        int r,c;
        for(r=0; r<3; ++r)
        {
            for(c=0; c<3; ++c)
            {
                System.out.println("Enter elements index:"+r+c+":");
                A[r][c]=sc.nextInt();
            }
        }
        for(r=0; r<3; ++r)
        {
            for(c=0; c<3; ++c)
            {
                System.out.println("\"Enter elements index:"+r+""+c+ ":");
                B[r][c]=sc.nextInt();
            }
        }

        for(r=0; r<3; ++r)
        {
            for(c=0; c<3; ++c)
            {
                C[r][c]=A[r][c]+B[r][c];
            }
        }
System.out.println("First array:");
        for(r=0; r<3; ++r)
        {
            for(c=0; c<3; ++c)
            {
                System.out.print("\t"+A[r][c]);
            }
            System.out.println("");
        }
        System.out.println("Second array:");
        for(r=0; r<3; ++r)
        {
            for(c=0; c<3; ++c)
            {
                System.out.print("\t"+B[r][c]);
            }
            System.out.println("");
        }
        System.out.println("Addition of two array array:");
        for(r=0; r<3; ++r)
        {
            for(c=0; c<3; ++c)
            {
                System.out.print("\t"+C[r][c]);
            }
            System.out.println("");
        }


    }
     
}
