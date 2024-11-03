import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("1- Area of Right Triangle");
        System.out.println("2-Area of Equilateral Triangle");
        System.out.println("3-Area of Square");
        System.out.println("4-Area of Rectangle");
        System.out.println("5-Area of Circle");
        int c=sc.nextInt();
        switch(c)
        {
            case 1:{
                System.out.println("Enter the base:");
                float l=sc.nextFloat();
                System.out.println("Enter the heigth:");
                float b=sc.nextFloat();
                System.out.println("Area of righ Triangle"+(l*b)/2);
            }
            case 2:{
                System.out.println("Enter the area:");
                 float a=sc.nextFloat(); //2.3
                 System.out.println("Area of Equilateral Triangle:"+(1.73*a*a)/4);
            }
            case 3:
            {
                System.out.println("Enter the side:");
                float s=sc.nextFloat();
                float ss=s*s;
                System.out.println("Area of square:"+ss);
            }
            case 4:
            {
                System.out.println("Enter the Length:");
                float l=sc.nextFloat();
                System.out.println("Enter the width:");
                float w=sc.nextFloat();
                float rec=l*w;
                System.out.println("Area of rectagle:"+rec);
            }
            case 5:
            {
                System.out.println("Enter the radius:");
                 float r=sc.nextFloat();
                 System.out.println("Area of circle:"+(3.14*r*r));
            }
        }
    }
}
