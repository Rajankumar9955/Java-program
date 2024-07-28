
/*Write a program to accept the annual income from the user and calculate 
tax based of the below conditions:

In each case provide standard deduction of 50,000 INR, calculate taxable income by 
subtracting 50,000 form annual income.
if the taxable income is:
less than equal to 3,00,000 INR tax rate will be 0%.
greater than 3,00,000 INR and less than or equal to 5,00,000 INR tax rate will be 5%.
greater than 5,00,000 INR and less than or equal to 10,00,000 INR tax rate will be 15%.
greater than 10,00,000 INR and less than or equal to 15,00,000 INR tax rate will be 20%.
greater than 15,00,000 INR and less than or equal to 25,00,000 INR tax rate will be 25%.
greater than 25,00,000 INR tax rate will be 30%.
On the basis of the condition calculate tax amount and print. 
*/
import java.util.Scanner;
public class eleven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Annual income:");
        int num=sc.nextInt();
        int rate;
        if(num<300000)
        {
            System.out.println("Your Tax is :0");
        }
        else if(num>300000 && num<500000)
        {
            rate=num*5/100;
            System.out.println("your tax is:"+rate);
        }
        else if(num>500000 && num<1000000)
        {
            rate=num*15/100;
            System.out.println("Your tax is:0"+rate);
        }
        else if(num>1000000 && num<1500000)
        {
            rate=num*20/100;
            System.out.println("Your tax is:"+rate);
        }
        else if(num>1500000 && num<2500000)
        {
            rate=num*25/100;
            System.out.println("Your tax is:"+rate);
        }
        else if(num>2500000)
        {
            rate=num*30/100;
            System.out.println("Your tax is:"+rate);
        }

    }
}
