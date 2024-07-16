//multiple catch
 class Except2{
 public static void main(String args[]){
	int num=0;
	try
	{
		num=Integer.parseInt(args[0]);
	}catch(ArrayIndexOutOfBoundsException ae){
	 System.out.println("Please Enter At least one argument");
	}catch(NumberFormatException ne){
	System.out.println("Pls enter Numeric value only");
	}
System.out.println("Result:"+(int)(Math.pow(num,2)));
}
}