// Java Program to demonstrate Class Variable
import java.io.*;
class create3 {
    // class variable
    private static final double PI = 3.14159;
    private double radius;
    public GFG(double radius) { this.radius = radius; }
    public double getArea() { return PI * radius * radius; }
    public static void main(String[] args)
    {
        GFG obj = new GFG(5.0);
        System.out.println("Area of circle: "
                           + obj.getArea());
    }
}