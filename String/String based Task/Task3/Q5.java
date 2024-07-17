
/*
 5. Write a java program to sort a string array in ascending order.
Test Data :
Input the string : w3resource
Expected Output :
After sorting the string appears like :
3ceeorrsuw
 */

public class Q5 {

    public static void main(String[] args) {
        String arr= new String("w3resource");
        System.out.println("Before sorting");
        System.out.println(arr);
        char c[]=arr.toCharArray();
        int ch=c.length;
        int s=0;
        for(int i=0; i<ch; ++i)
        {
             for(int j=0; j<ch-i-1;++j)
             {
                if(c[j]>c[j+1])
                {
                   char temp=c[j];
                   c[j]=c[j+1];
                   c[j+1]=temp;
                   s++;
                }
             }
        }
        System.out.println("After sorting");
        for(int i=0; i<ch; ++i)
        {
            System.out.print(c[i]);
        }   
    }
}