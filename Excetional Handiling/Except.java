//Exceptional Handling in java
class Except{
 public static void main(String args[]){
  int a,b,c=0;
  a=10;
  b=0;
  System.out.println("Before Exception");
  try{
c=a/b;
System.out.println("This is try block");
}
catch(ArithmeticException ae)
{
  System.out.println("This is catch block");
System.out.println("Denominator should not be zero");
}
 System.out.println("After Exception");
System.out.println("Result="+c);
}
}