package Day1;

public class LoopsPractice {
    public static void main(String[] args) {

        String str = "Cybertek School";
        //            01234567

        String result = "";

        for(int i=str.length()-1; i>=0; i--){
            result += str.charAt(i);
        }
        System.out.println(result);

        String result2 = "";
        int j = str.length()-1;

        while ( j >= 0 ){

            result2 += str.charAt(j);
            j--;
        }
        System.out.println(result2);

        System.out.println("===============================================");

        String s1 = "aaabbbccc";
        String r = ""; // "abc"

        for (String each: s1.split("")) {
            if(r.contains(each)){
                continue;
            }
            r += each;

        }
        System.out.println(r);


    }
}
