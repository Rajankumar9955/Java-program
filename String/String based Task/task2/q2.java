import java.util.Scanner;

public class q2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("How many string you want to perform\n");
        int n=sc.nextInt();
        String arr[]=new String[n];
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextLine();
        }
        for(int i=0; i<n; i++)
        {
            if(arr[i].contains("he"))
            {
                System.out.println(arr[i]);
            }
        }

        
    }
}