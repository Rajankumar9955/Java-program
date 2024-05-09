//WAP to calculate square and cube of given number
 
import java.util.Scanner;

class sqcube{
    public static void main(String args[]){
    int n,s,c;
    Scanner kb=new Scanner(System.in);
    System.out.println("Enter Any number:");
    n=kb.nextInt();
    s=n*n;
    c=n*n*n;
    System.out.println("Square:"+s);
    System.out.println("Cube:"+c);
  }
}
    
    