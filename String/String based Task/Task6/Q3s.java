



import java.util.Scanner;
public class Q3s {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(("Enter the string"));
        String str=sc.nextLine();
        char c[]=str.toCharArray();
        System.out.println("Enter the index");
        int v=sc.nextInt();
        System.out.println("index of the char is:"+c[v]);
    }
}
