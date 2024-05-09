import java.util.Scanner;
class Circlea{
        public static void main(String args[]){
        float r,ar,cr;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter Radius:");
        r=obj.nextFloat();
        ar=3.14f*r*r;
        cr=2*3.14f*r;
        System.out.println("Area of circle:"+ar);
        System.out.println("Area of circumference:"+cr);
     }
}