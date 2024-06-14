import java.util.Scanner;
public class str2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // System.out.println("Enter the number for indexes");
        // int in=sc.nextInt();
        String arr[]=new String[2];
        System.out.println("Enter the  2 names");
        for(int i=0; i<arr.length; ++i)
        {
          arr[i]=sc.nextLine();
        }
        for(int i=0; i<2; ++i)
        {
            if(arr[i].toLowerCase().endsWith("h"));
            System.out.println(arr[i]);
            
        }
        
        
       
    }
    
}
