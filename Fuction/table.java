import java.util.Scanner;
class table{
        public static void  table(int n){  //actual argument
  	for(int i=0; i<=10; ++i)
	{	
	  System.out.printf("\n%d *%d = %d",n,i,n*i);
	}
}

         public static void main(String args[]){
           Scanner sc=new Scanner(System.in);
           int a=sc.nextInt();
         table(a); //Actual argument
}
}

