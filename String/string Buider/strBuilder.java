//String builder
class strBuilder{
public static void main(String args[]){
StringBuilder str = new StringBuilder();
str.append("Welcome");
str.insert(7," to Bhopal");
System.out.println(str);
str.delete(11,17);
System.out.println(str);
}
}

