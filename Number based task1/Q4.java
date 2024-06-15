import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int math;
        int eng;
        int sci;
        int art;
        int com;
       
        System.out.println("Enter marks out of 100");
        System.out.println("Enter math Marks:");
        math=sc.nextInt();
        System.out.println("Enter the English marks:");
        eng=sc.nextInt();
        System.out.println("Enter the Science:");
        sci=sc.nextInt();
        System.out.println("Enter the Art marks:");
        art=sc.nextInt();
        System.out.println("Enter the computer:");
        com=sc.nextInt();

        int total=(math+eng+sci+art+com);
        System.out.println("Total marks out of 500:"+total);
        int per=(math+eng+sci+art+com)/5;
        System.out.println("Percent of marks:"+per+"%");

        
    }
}
