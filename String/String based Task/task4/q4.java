/*4. Write a program in java to replace the spaces of a string with a specific
character.
Test Data :
Input a string :Be glad to see the back of
Input replace character : *
Expected Output :
After replacing the space with * the new string is :
Be*glad*to*see*the*back*of*
*/

public class q4 {
    public static void main(String[] args) {
        String s="Be glad to see the back of";
        char ch='*';
        s=s.replace(' ',ch);
        System.out.println(s);

    }
    
}
