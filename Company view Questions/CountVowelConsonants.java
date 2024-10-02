
// public class CountVowelConsonants {
//     public static void main(String[] args) {
//         String str="Rajan";
//         int vowels=0, consonants=0;
//         for(char c:str.toCharArray())
//         {
//             if("aeiouAEIOU".indexOf(c)!=-1)
//             {
//                 vowels++;
//             }
//             else if(Character.isLetter(c))
//             {
//                 consonants++;
//             }
//         }
//         System.out.println("Vowels: "+vowels+", consonants: "+consonants);
//     }
// }


public class CountVowelConsonants{
    public static void main(String[] args)
    {
        String str="Rajan";
        int vowel =0, consonants=0;
        for(char c:str.toCharArray())
        {
            if("aeiouAEIOU".indexOf(c)!=-1)
            {
                vowel++;
            }
            else if(Character.isLetter(c)){
                consonants++;
            }
        }
        System.out.println("vowel: "+vowel + " consonants: "+ consonants) ;
    }
}