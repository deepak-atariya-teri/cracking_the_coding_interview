import java.util.Arrays;

public class SubSet {
    public static void subset(int weights[], int subset[], int i) {

        if (i == weights.length) {
            System.out.print("[");
            for (int j = 0; j < subset.length; j++) {
                if(subset[j]>-1){
                    System.out.print(subset[j]+" ");
                }
            }
            System.out.println("]");
        } else {
            subset[i] = -1;
            subset(weights, subset, i + 1);
            subset[i] = weights[i];
            subset(weights, subset, i + 1);
        }
    }

    // subset iteratively ?
    public static void subsetItr(int weights[], int subset[], int i) {
        /*
         len = 2^n - 1
        */
    }

    public static void main(String[] args) {
        int set[] = { 10, 20, 30 };

        long startTime = System.nanoTime();
        subset(set, new int[set.length], 0);
        long endTime = System.nanoTime();

        long milisecond = (endTime - startTime)/1000000;
        long microsecond = (endTime - startTime)/10000;
        long nanosecond = (endTime - startTime)/1000;
        System.out.println("Total time : "+milisecond+" milisecond");
        System.out.println("Total time : "+microsecond+" microsecond");
        System.out.println("Total time : "+nanosecond+" nanosecond");
    }   
}