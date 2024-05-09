//operator

import java.util.Scanner;
class opr{
  public static void main(String args[]){
int a,rm,n;
Scanner rk=new Scanner(System.in);
System.out.println("Enter the number:"); a=rk.nextInt();

 n=a/100;
 System.out.println("Nodes of 100:"+n);
  rm=a-n*100;

 n=rm/50;
 System.out.println("Nodes of 50:"+n);
rm=rm-n*50;

n=rm/20;
System.out.println("Nodes of 20:"+n);
rm=rm-n*20;

n=rm/10;
System.out.println("Nodes of 10:"+n);
rm=rm-n*10;

n=rm/5;
System.out.println("Nodes of 5:"+n);
rm=rm-n*5;

n=rm/2;
System.out.println("Nodes of 2:"+n);
rm=rm-n*2;

n=rm/1;
System.out.println("nodes of 1:"+n);
rm=rm-n*1;
}
}




      