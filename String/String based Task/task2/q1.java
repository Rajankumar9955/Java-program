import java.util.Scanner;
public class q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number for indexes");
        int n=sc.nextInt();
        String arr[]=new String[n];
        
        System.out.println("Enter the  2 names");
        for(int i=0; i<n; ++i)
        {
          arr[i]=sc.nextLine();
        }
        for(int i=0; i<n; ++i)
        {
            if(arr[i].toLowerCase().endsWith("h")){
                System.out.println(arr[i]);
            }
            
            
        }
        
        
       
    }
    
}
