import java.util.Scanner;
class CheckChar{
public static void main(String args[]){
char ch;
Scanner kb=new Scanner(System.in);
System.out.println("Enter any chara:");
ch=kb.next().charAt(0);
if(ch>='a' && ch<='z'){
System.out.println("This is lower case charater:"+ch);
}
else if(ch>='A' && ch<='Z'){
System.out.println("This is upper case charater:"+ch);

}
else if(ch>='0' && ch<='9'){
System.out.println("This is digit:");
}
}
}
