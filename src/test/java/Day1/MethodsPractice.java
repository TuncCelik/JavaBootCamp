package Day1;

public class MethodsPractice {

    public static void main(String[] args) {

        String str1 = "Muhtar";

        System.out.println( reverseStr(str1) );


        String word = "Civic";
        String reversedWord = reverseStr(word);

        boolean isPalindrome = word.equalsIgnoreCase(reversedWord);


        System.out.println( "Is Palindrome: "+isPalindrome);


        System.out.println( isPalindrome("tras neden sart"));

        System.out.println(isPalindrome("Cybertek"));

    }
    public static String reverseStr(String str){

        String result = "";
        for(int i = str.length()-1 ; i >= 0; i--){
            result += str.charAt(i);
        }
        return result;
    }

    public static boolean isPalindrome( String word){
        return    reverseStr(word).equalsIgnoreCase(word);
    }
    
}
