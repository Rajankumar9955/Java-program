//replace method():- replace(int start ,int end-1,"done")

class replace{

/*public static void main(String args[]){
StringBuffer s = new StringBuffer("Well-come");
System.out.println("Before replace :"+s);
s.replace(4,9,"done");
System.out.println("After replace :"+s);
*/

public static void main(String args[]){
StringBuffer s = new StringBuffer("Well-come");
                                   //wbll-cbmb
System.out.println("Before replace :"+s);
for(int i=0; i<s.length(); ++i){
  char c=s.charAt(i);
if(c=='a' || c=='i' || c=='o' || c=='u' || c=='e' ){
s.replace(i,i+1,"b");
}
}
System.out.println("After replace :"+s);

}
}