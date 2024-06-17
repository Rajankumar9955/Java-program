import java.util.Scanner;
public class first {
    public static void main(String[] args) {
        // int arr[][]=new int[3][3];
        // arr[0][0]=10;
        // arr[0][1]=20;
        // arr[0][2]=30;

        // arr[1][0]=40;
        // arr[1][1]=50;
        // arr[1][2]=60;

        // arr[2][0]=70;
        // arr[2][1]=80;
        // arr[2][2]=90;

        // System.out.println(arr[0][0]+"\t"+arr[0][1]+"\t"+arr[0][2]);
        // System.out.println(arr[1][0]+"\t"+arr[1][1]+"\t"+arr[1][2]);
        // System.out.println(arr[2][0]+"\t"+arr[2][1]+"\t"+arr[2][2]);

        // =======================================================
       //=================== example 02 ======================================

        // int arr[][]={{10,20,30},{40,50,60},{70,80,90}};

        //  System.out.println(arr[0][0]+"\t"+arr[0][1]+"\t"+arr[0][2]);
        // System.out.println(arr[1][0]+"\t"+arr[1][1]+"\t"+arr[1][2]);
        // System.out.println(arr[2][0]+"\t"+arr[2][1]+"\t"+arr[2][2]);
// ======================================================================================

// ====================Example with Dynmic programming===================================
                
        int arr[][]=new int[3][3];
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the index of 00 :");
        arr[0][0]=sc.nextInt();
        System.out.println("Enter the index of 01 :");
        arr[0][1]=sc.nextInt();
        System.out.println("Enter the index of 02");
        arr[0][2]=sc.nextInt();
       
        System.out.println("Enter the index of 10 :");
        arr[1][0]=sc.nextInt();
        System.out.println("Enter the index of 11 :");
        arr[1][1]=sc.nextInt();
        System.out.println("Enter the index of 12");
        arr[1][2]=sc.nextInt();

        System.out.println("Enter the index of 20 :");
        arr[2][0]=sc.nextInt();
        System.out.println("Enter the index of 21 :");
        arr[2][1]=sc.nextInt();
        System.out.println("Enter the index of 22");
        arr[2][2]=sc.nextInt();

       
        System.out.println(arr[0][0]+"\t"+arr[0][1]+"\t"+arr[0][2]);
        System.out.println(arr[1][0]+"\t"+arr[1][1]+"\t"+arr[1][2]);
        System.out.println(arr[2][0]+"\t"+arr[2][1]+"\t"+arr[2][2]);



    }
    
}
