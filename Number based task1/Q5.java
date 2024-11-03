import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the selling price");
        int sell=sc.nextInt();
        System.out.println("Enter the Cost price");
        int cost=sc.nextInt();
        if(sell>cost)
        {
            int profit=sell-cost;
            System.out.println("You are in profit:"+profit);
        }
       else{
        int loss=cost-sell;
        System.out.println("Your are in loss:"+loss);
        }
       
    }
}
