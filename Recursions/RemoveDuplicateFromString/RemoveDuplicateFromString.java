import java.util.Arrays;

public class RemoveDuplicateFromString {

    public static String removeDuplicateFromStringRecursion(char str[], int i, String results) {
        System.out.println(results);
        if (str.length == i) {
            return results;
        }

        // this can be improved by one more recursion call (to compare and put ?)
        for (int j = i+1; j < str.length; j++) {
            if (str[i]==str[j]) {
                str[j] = '?';
            }
        }
        if(str[i]!='?'){
            // System.out.print(str[i]);
            results+=str[i];
        }
        return removeDuplicateFromStringRecursion(str, (i+1), results);
        // return results;
    }

    
    public static void main(String[] args) {

        char input[] = "Deepak".toCharArray();

        System.out.println("Input - "+Arrays.toString(input));

        long startTime = System.nanoTime();
        System.out.println("Output - "+removeDuplicateFromStringRecursion(input, 0,""));
        long endTime = System.nanoTime();

        long milisecond = (endTime - startTime) / 1000000;
        long microsecond = (endTime - startTime) / 10000;
        long nanosecond = (endTime - startTime) / 1000;
        System.out.println("Total time : " + milisecond + " milisecond");
        System.out.println("Total time : " + microsecond + " microsecond");
        System.out.println("Total time : " + nanosecond + " nanosecond");

    }



}

