//palindrome

import java.util.Scanner;
class palin{
Public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Please Enter Approx Two Digit number");
System.out.println("Enter the number");
int n=sc.nextInt(); //1
int sum=0,result;
int temp=n;
while(n>0){
 result=n%10; //1
 sum=(sum*10)+result; //431
n=n/10; //0
}
if(temp==sum)
{
System.out.println("This is palindrome number");
}
else{
System.out.println("This is Not Pallindrome");
}
}
}


