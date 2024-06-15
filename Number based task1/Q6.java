import java.util.Scanner;


public class Q6 {
      public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
          int age=sc.nextInt();
          if(age>0 && age<17)
          {
            System.out.println("Your are Not eligibile for vote");
          }
          else if(age>18)
          {
            System.out.println("you are not eligible for vote");
          }  
          else{
            System.out.println("Your have enter wrong number");
          }
      }
    
}