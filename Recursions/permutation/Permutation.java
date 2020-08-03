public class Permutation {

    public static void permutation(String str, int l, int r) {
        // System.out.println("("+l+", "+r+")");
        if (l == r) {
            System.out.println(str);
        } else {
            for (int i = l; i <= r; i++) {

                str = swap(str, l, i);
                permutation(str, l + 1, r);
                str = swap(str, l, i);
            }
        }
    }

    public static String swap(String str, int l, int r) {
        char strChar[] = str.toCharArray();
        char temp = strChar[l];
        strChar[l] = strChar[r];
        strChar[r] = temp;

        return new String(strChar);
    }

    public static void main(String[] args) {
        long startTime = System.nanoTime();
        String input = "ABCD";
        permutation(input, 0, input.length()-1);
        long endTime = System.nanoTime();

        long milisecond = (endTime - startTime) / 1000000;
        long microsecond = (endTime - startTime) / 10000;
        long nanosecond = (endTime - startTime) / 1000;
        System.out.println("Total time : " + milisecond + " milisecond");
        System.out.println("Total time : " + microsecond + " microsecond");
        System.out.println("Total time : " + nanosecond + " nanosecond");
    }

}