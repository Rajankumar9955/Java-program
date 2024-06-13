import java.util.Scanner;
public class second {
    // public static void main(String[] args) {
    //     //array declaration and initialization 
    //     int arr[]={12,23,52,46,875,75,91};
    //     System.out.println("Indexing of array");
    //     System.out.println(arr[0]);
    //     System.out.println(arr[1]);
    //     System.out.println(arr[2]);
    //     System.out.println(arr[3]);
    //     System.out.println(arr[4]);
    //     System.out.println(arr[5]);
    //     System.out.println(arr[6]);

    // }

// =============================example 02===================================
    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     int arr[]=new int[5];
    //     System.out.println("enter the index 0");
    //     arr[0]=sc.nextInt();
    //     System.out.println("enter the index 1");
    //     arr[1]=sc.nextInt();
    //     System.out.println("enter the index 2");
    //     arr[2]=sc.nextInt();
    //     System.out.println("enter the index 3");
    //     arr[3]=sc.nextInt();
    //     System.out.println("enter the index 4");
    //     arr[4]=sc.nextInt();

    //     System.out.print(arr[0]+" ");
    //     System.out.print(arr[1]+" ");
    //     System.out.print(arr[2]+" ");
    //     System.out.print(arr[3]+" ");
    //     System.out.print(arr[4]+" ");
    //     System.out.print(arr[5]+" ");
    //     System.out.print(arr[6]+" ");
// ========================================example 03====================
// public static void main(String[] args) {
    
//          Scanner sc=new Scanner(System.in);
//          int arr[]=new int[5];
//          int l=arr.length;
        
//          for(int i=0; i<l; ++i)
//          {
//             System.out.println("Enter the index number"+i+" ");
//             arr[i]=sc.nextInt();
//          }

//          System.out.println("Elements of the array");

//          for(int j=0; j<l; ++j){
//             System.out.println(arr[j]);
//          }
        //=========================================String array=============================
        public static void main(String[] args) {
    
            Scanner sc=new Scanner(System.in);
            String arr[]=new String[5];
            int l=arr.length;
           
            for(int i=0; i<l; ++i)
            {
               System.out.println("Enter the index String : "+i+" ");
               arr[i]=sc.nextLine();
            }
   
            System.out.println("Elements of the array");
            
            for(int j=0; j<l; ++j){
               System.out.println(arr[j]);
            }
            
    
    }
}
