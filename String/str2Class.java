//class task

class str2Class{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
String naam[]= new String[10];
System.out.println("Enter the 10 names");

for(int i=0; i<naam.length(); ++i){
 naam[i]=sc.nextLine();
}
System.out.println("Enter a letter: ");
char ch=sc.next().charAt(0);
ch=character.UpperCase(ch);

for(int i=0; i<naam.length; ++i){
if(Character.UpperCase(naam[i].charAt(0)) ==ch);
System.out.println(naam[i]);
}
}
}