package string_rotation;

import java.util.Arrays;

// String Rotation: Assume you have a method isSubstring which checks if one word is a substring of another. Given two strings, S1 and S2, write code to check if S2 is a rotation of S1 using only one call to isSubstring (e.g., "waterbottle" is a rotation of"erbottlewat").

public class StringRotation {

    // o(n^2)
    public static String rotateStringSolution1(String str, String str1) {
    
        char strCh[] = str.toCharArray();
        int l = strCh.length;
        for (int r = 0; r < strCh.length; r++) {
            for (int i = 0; i < l - 1; i++) {
                char temp = strCh[i];
                strCh[i] = strCh[i + 1];
                strCh[i + 1] = temp;
            }
            if (str1.equals(new String(strCh))) {
                return "yes";
            }
        }
        return "no";

    }
    public static String rotateStringSolution2(String str, String str1) {

        // substring algorithm
        char string1[] = "ABCD".toCharArray();
        char string2[] = "AB".toCharArray();

        for (int i = 0; i < string2.length; i++) {
            for (int j = 0; j < string1.length; j++) {
                if(string2[i]==string2[j]){
                    
                }else{

                }
            }
        }


        return null;
    }




    public static void main(String[] args) {
        
        String input = "ABCDEF";
        String input1 = "EFABCD";
        long startTime = System.nanoTime();
        System.out.println(rotateStringSolution1(input, input1));
        long endTime = System.nanoTime();
        
        long milisecond = (endTime - startTime)/1000000;
        long microsecond = (endTime - startTime)/10000;
        long nanosecond = (endTime - startTime)/1000;
        System.out.println("Total time : "+milisecond+" milisecond");
        System.out.println("Total time : "+microsecond+" microsecond");
        System.out.println("Total time : "+nanosecond+" nanosecond");

    }

}