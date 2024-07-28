/*Write a program that print the current balance of the account, ask the user to enter the withdrawal amount.

if withdrawal amount is less than current balance,
deduct the withdrawal amount form the current balance, if current balance after deduction is less than 500 INR, 
deduct penalty of 50 INR and print current balance and penalty.
otherwise, print the current balance.
If withdrawal amount is greater than current balance, print insufficient funds.
Sample run 1
Current balance = 5000
Enter withdrawal amount - 4600
Current balance = 350
Penalty = 50

Sample run 2
Current balance = 5000
Enter withdrawal amount - 4500
Current balance = 500

Current balance = 5000
Enter withdrawal amount - 5600
insufficient funds
 */


 import java.util.Scanner;
public class Nine {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int current =5000;
        System.out.println("Your current balance is:"+current);
        System.out.print("Enter the withdrawal Amount:");
        int with=sc.nextInt();
        if(current<with)
        {
           System.out.println("Unsufficient balance");
        }
        else if(current==with) { 
            int s=current-with;
            System.out.println("Your current balance:"+s);
        }
        else
        {
              int cur=current-with;
              if(cur<500)
              {
                 int cu=cur-50;
                 System.out.println("Current balance is:"+cu);
                 System.out.println("Penalty is:"+50);
              }
              else{
                System.out.println("Current balance is:"+cur);
              }
        }
        

    }
    
}
