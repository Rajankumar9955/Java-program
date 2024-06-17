import java.util.Scanner;
public class DecToBinary {
    public static void main(String[] args) {
//         int n;
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter any number:");
//         n=sc.nextInt();
//         int arr[]=new int[32];
//         int i=0;
//         while(n>0) 
//         {
//             int r=n%2; //6
//             arr[i]=r;
//             i++;
//             n=n/2;
//         }
//         System.out.print("Binary number:");
//         for(i=i-1; i>=0; i--)
//         {
//             System.out.print("\t"+arr[i]);
//         }



int n;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the any decimal number:");
n=sc.nextInt();
int arr[]=new int[32];
int i=0;
while(n>0)
{
    int r=n%2;
    arr[i]=r;
    i++;
    n=n/2;
}
System.out.print("Your Binary number is:");
for( i=i-1; i>=0; i--)
{
    System.out.print("\t"+arr[i]);
}
    }
}
