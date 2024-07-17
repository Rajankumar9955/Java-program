public class leet {
    public static void main(String[] args) {
        String words="this th thjan";
        String sh="th";
        int c=0;
        String s[]=words.split(" ");
       for(int i=0; i<s.length; ++i)
       {
           System.out.println(s[i]);
           if(s[i].startsWith(sh))
           {
              c++;
           }
           
       }
            System.out.println(c);
    }   
}
