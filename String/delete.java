//delete : String Buffer delete(int start,int end)

//Example:01

class delete{
/*public static void main(String args[]){
StringBuffer str = new StringBuffer("WEL-come");
System.out.println("before delete "+str);
str.deleteCharAt(2);
System.out.println("after delete "+str);
*/
 
//example:02

public static void main(String args[])
{
StringBuffer str = new StringBuffer("WELCOME");
System.out.println("Before delete :"+str);
str.delete(2,5);
System.out.println("After delete :"+str);

}
}