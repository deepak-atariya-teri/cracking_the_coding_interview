public class StringCompression {

    public static String stringCompression(String string) {
        char str[] = string.toCharArray();
        String newStr = "";
        for (int i = 0; i < str.length; i++) {
            int count = 0;
            char character = 0;
            for (int j = i; j < str.length; j++) {
                // System.out.println(str[i]+" == "+str[j]);
                if (str[i] == str[j]) {
                    count++;
                    character = str[i];
                }else {
                    // System.out.print("anything");        
                    i = j-1;
                    break;
                }

                if(j==str.length-1){
                    i=j;
                }
            }
            newStr+=character+String.valueOf(count);
            // System.out.print(character+String.valueOf(count));
        }
        return newStr.length()<string.length()?newStr:string;
    }

    public static void main(String[] args) {
        // String str = "aaaabbbbbccccc";
        String stringCompressionCases[] = {"aaaabbbcccaaa", "aaabbaaab", "abababab", "abc"};
        for (String string : stringCompressionCases) {
            System.out.println(string+" --> "+stringCompression(string));
        }
    }
}