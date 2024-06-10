//insert method() :- insert method insert the given string the specified position,
//sintex:
/*stringBuffer insert(int position , String object)
*/

class insert{
public static void main(String args[]){
StringBuffer s = new StringBuffer("Wel-come");
System.out.println("Before insert :"+s);
s.insert(8,"To");
System.out.println("After insert :"+s);
}
}