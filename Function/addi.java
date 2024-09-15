//Taking something returning something

import java.util.Scanner;
class addi{
	   public static int add(int a,int b){
           return a+b;

	}

	public static void main(String args[]){
	
	Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a=sc.nextInt();
	System.out.println("Enter the second number:");
	int b=sc.nextInt();
        int res=add(a,b);
	System.out.println("Addition:"+res);
}
}
