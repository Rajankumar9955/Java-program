import java.util.Scanner;
public class Q8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Basic salary:");
        double bs=sc.nextFloat();
        double da=0.05*bs;
        double hr=0.10*bs;
        double pf=0.12*bs;
        double net=da+hr+bs-pf;
        System.out.println("Basic salary:"+bs);
        System.out.println("DA:"+da);
        System.out.println("Hr:"+hr);
        System.out.println("pf:"+pf);
        System.out.println("Net_pay:"+net);
    }
}
