//USING LOGICAL NOT OPERATORS
class op5{
public static void main(String args[]){
int a,b,c,d;
a=10;
b=20;
c=30;
d=40;
boolean r=!(a<b || c<d);
  //10<20 && 30<40
//T && t..........>!T
System.out.println(r);
}
}

//output: FALSE