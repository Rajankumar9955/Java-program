// /**
//  * ques1
//  */
// public class ques1 {
//     public static void main(String[] args) {
//         String s = new String("Betty got a bit of bitter better butter");
//         String c[] = s.split(" ");
//         for(int i=0; i<c.length; i++)
//         {
//             System.out.println(c[i]+"  "+c[i].length());
//         }
//         char ch[] = s.toCharArray();
//         for(int i=0; i<ch.length; i++)
//         {
//             if(ch[i]=='b')
//             {
//                 System.out.println("index of b: "+i);
//             }
//             else if(ch[i]=='t')
//             {
//                 System.out.println("index of t: "+i);
//             }
//         }
//         for(int i=0; i<c.length; i++)
//         {
//             if(c[i].charAt(0)=='b')
//             {
//                 System.out.println(c[i]);
//             }
//         }
//     }
// }


/**
 * ques1
 */
public class ques1 {

    public static void main(String[] args) {
        String s=new String("Betty got a bit of bitter better butter");
        String c[]=s.split(" ");
        for(int i=0; i<c.length; i++)
        {
            System.out.println(c[i]+":"+c[i].length());
        }
        char ch[]=s.toCharArray();
        for(int i=0; i<ch.length; ++i)
        {
            if(ch[i]=='b')
            {
                System.out.println("Index of b:"+i);
            }
            else if(ch[i]=='t')
            {
                System.out.println("Index of t:"+i);
            }
        }
        for(int i=0; i<c.length; ++i)
        {
            if(c[i].charAt(0)=='b')
            {
                System.out.println(c[i]);
            }
        }
    }
}