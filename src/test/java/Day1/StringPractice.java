package Day1;

import java.util.Locale;

public class StringPractice {
    public static void main(String[] args) {

        String str1 = "EU3"; //String pool in heap
        String str2 = new String("EU3"); // outside string poll--> heap

        str1.toLowerCase(); //eu3
        str1.concat(" School");
        System.out.println(str1);

        StringBuilder sb1 = new StringBuilder("EU3");
        sb1.append(" School");
        System.out.println(sb1);

        StringBuffer sb2 = new StringBuffer("EU3");
        sb2.append(" School");
        System.out.println(sb2);

        String  s1 = "Cybertek";
        s1.charAt(s1.length()-1);
        char ch1 = s1.charAt(1);
    }

}
