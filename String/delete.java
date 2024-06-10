//delete 

class delete{
public static void main(String args[]){
StringBuffer str = new StringBuffer("WEL-come");
System.out.println("before delete "+str);
str.deleteCharAt(2);
System.out.println("after delete "+str);
}
}