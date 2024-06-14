// import java.util.Scanner;

public class str5 {
    public static void main(String[] args) {
        
    // Scanner sc=new Scanner(System.in); 
    String s= new String("Welcome to bhopal");
    String sk[]=s.split(" ");
    int sum=0;
    for(int i=0; i<sk.length; ++i)
    {
        sum=sum+i;
    }
    System.out.println("Total number of words in the string is:"+sum);
   
   }
}
