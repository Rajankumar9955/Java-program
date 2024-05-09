//area of circle and area of circumference

import java.util.Scanner;
class CircumFerence{
      public static void main(String args[]){
      float r,ar,cr;
      Scanner kb=new Scanner(System.in);
      System.out.println("Enter radius of circle:");
      r=kb.nextFloat();
      ar=3.14f*r*r;
      cr=2*3.14f*r;
      System.out.println("Area of circle:"+ar);
      System.out.println("Area of circumference:"+cr);
  }
}