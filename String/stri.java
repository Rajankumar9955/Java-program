//string
class stri{
public static void main(String args[])
{
   String a=new String();
   System.out.println(a);

  String b=new String ("Welcome to Bhopal");
  System.out.println(b);

  char arr[]={'A','B','C','D'};
  String c=new String (arr);
  System.out.println(c);

  byte d[]={65,66,67,68,69,70};
  String e=new String(d,0,5);
  System.out.println(e);
}
}