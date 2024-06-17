import java.util.Scanner;
public class Q7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entre any number");
        int num=sc.nextInt();
        if(num%111==0)
        {
            System.out.println("This is nelsom number:"+num);
        }
        else{
            System.out.println("This is not nelson number:"+num);
        }
    }
    }
   
