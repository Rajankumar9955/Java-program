//swapping two variable using XOR operator
class XorSwap{
public static void main(String args[]){
int a=10; 
int b=20;
System.out.println("Before swapping:");
System.out.printf("\na=%d b=%d",a,b);
//using xor operator
a=a^b;
b=a^b;
a=a^b;
System.out.println("\nAfter swapping:");
System.out.printf("\na=%d b=%d",a,b);
}
}
/*
output:-

Before swapping:

a=10 b=20
After swapping:

a=20 b=10
*/