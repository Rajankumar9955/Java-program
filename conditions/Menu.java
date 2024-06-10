import java.util.Scanner;
class Menu{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int c=sc.nextInt();
float a=sc.nextFloat();
float b=sc.nextFloat();
System.out.println("Enter the 1 for area of right triangle");
System.out.println("Enter the 2 for Area of Equilateral Triangle");
System.out.println("Enter the 3 for Area of Square");
System.out.println("Enter the 4 for Area of Rectangle");
System.out.println("Enter the 5 for area for circle");
switch(c){
 case 1:
         System.out.println(0.5*a*b);
       
 case 2:
        System.out.println(3/4*a);
       
 case 3:
       System.out.println(a*a);
       
 case 4:
	System.out.println(a*b);

 case 5:
	System.out.println(3.14*a);
}	
}
}
