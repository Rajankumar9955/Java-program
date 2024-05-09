//operator

import java.util.Scanner;
class opr{
  public static void main(String args[]){
Scanner rk=new Scanner(System.in);
System.out.println("Enter the number:");
int a=rk.nextInt();

 int hun=a/100;
 System.out.println("Nodes of 100:"+hun);

 int fifty;
 fifty=a%hun/50;
 System.out.println("Nodes of 50:"+fifty);

 int twenty;
twenty=a%hun%fifty/20;
System.out.println("Nodes of 20:"+twenty);

int ten=a%hun%fifty%twenty/10;
System.out.println("Nodes of 10:"+ten);

int five=a%hun%fifty%twenty%ten/5;
System.out.println("Nodes of 5"+five);

int two=a%hun%fifty%twenty%ten/2;
System.out.println("Nodes of 2"+two);

int one=a%hun%fifty%twenty%ten%two/1;
System.out.println("nodes of 1"+one);

}
}




      