import java.util.Scanner;
public class Q1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first array");
        String n=sc.nextLine();
       
        
        System.out.println("Enter the second array");
        String s=sc.nextLine();
        
        

        if(n.equals(s))
        {
            System.out.println("String are equal:");
        }
        else
        {
            System.out.println("String are not Equal:");
        }
       

        sc.close();

    }
}
