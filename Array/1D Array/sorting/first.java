/* 
Write a java program to sort array elements in
ascending order
Array Elements: 30 10 20
Before Sorting: 30 10 20
After Sorting : 10 20 30
*/
// ============================Dynamic Programming===============================
// import java.util.Scanner;

public class first {
           public static void main(String[] args) {
            // Scanner sc=new Scanner(System.in);


        //     System.out.println("Enter the number for index:");
        //     int n=sc.nextInt();
        //     int arr[]=new int[n];
        //     for(int i=0;i<n; ++i)
        //     {
        //         System.out.println("Enter the number for "+i+" Index");
        //         arr[i]=sc.nextInt();
        //     }
        //     System.out.print("Your array:");
        //     for(int j=0; j<arr.length; ++j)
        //     {
        //         System.out.print("\t"+arr[j]);
        //     }
        //     for(int i=0; i<arr.length; ++i)
        //     {
        //         for(int j=i+1; j<arr.length; ++j)
        //         {
        //             if(arr[i]>arr[j])
        //             {
        //                 int temp;
        //                 temp=arr[i];
        //                 arr[i]=arr[j];
        //                 arr[j]=temp;
        //             }
        //         }
        //     }
        //     System.out.println("\n");
        //  System.out.print("After sorting:");
        //  for(int i=0; i<arr.length; ++i)
        //  {
        //     System.out.print("\t"+arr[i]);
        //  }
           
//     }
// }


// =================== static programming========================

              int arr[]={23,25,35,64,25,21};
              System.out.print("Before sorting:");
              for(int i=0; i<arr.length; ++i)
            {
                 System.out.print("\t"+arr[i]);
             }
             
             for(int i=0; i<arr.length; ++i)
             {
                for(int j=i+1; j<arr.length; ++j)
                {
                    if(arr[i]>arr[j])
                    {
                        int temp;
                        temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }
             }
             System.out.println("\n");
            System.out.print("after sorting:");
            for(int i=0; i<arr.length; ++i)
            {
                System.out.print("\t"+arr[i]);
            }
        }
    }