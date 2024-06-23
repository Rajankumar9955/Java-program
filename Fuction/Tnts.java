//Taking nothing returning something

import java.util.Scanner;
class Tnts{
public static int add(){

         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the first number:");
        int a=sc.nextInt();
       System.out.println("Enter the second number:");
        int b=sc.nextInt();
int c=a+b;
return c;


}
public static void main(String args[]){

   int res=add();
System.out.println(res);
}

}
