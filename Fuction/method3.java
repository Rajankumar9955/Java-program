//Taking something returning nothing

import java.util.Scanner;
public class method3 {

   public static void add(int n1,int n2){//formal argument
    int n3=n1+n2;
    System.out.println("Addition:"+n3);
   }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int n1=sc.nextInt();
        System.out.println("Enter the second number:");
        int n2=sc.nextInt();


        add(100,200);//calling of the Addition function 
        add(n1,n2);//actual parameter
    }
    
}
