import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.IntStream;

public class Knapsack01 {

    public static ArrayList<int[]> container = new ArrayList<>();

    public static void subset(int weights[], int subset[], int i) {

        if (i == weights.length) {
            int element[] = subset.clone();
            container.add(element);
        } else {
            subset[i] = -1;
            subset(weights, subset, i + 1);
            subset[i] = weights[i];
            subset(weights, subset, i + 1);
        }

    }

    public static void knapsack01(int weights[], int values[], int bag) {

        // System.out.println(Arrays.toString(IntStream.range(0,
        // weights.length).toArray()));
        // 1. find all the subset
        subset(IntStream.range(0, weights.length).toArray(), new int[weights.length], 0);
        // int value_sets[][] = subset(values, new int[values.length], 0);
        // 2. test with all subset and build an array
        ArrayList<Integer> sum_values = new ArrayList<Integer>();
        for (int subset[] : container) {
            int weight_sum = 0;
            int value_sum = 0;
            for (int j = 0; j < subset.length; j++) {
                if(subset[j]>-1){
                    weight_sum = weight_sum + weights[subset[j]];
                    value_sum = value_sum + values[subset[j]];
                }
            }   
            if(weight_sum<=bag){
                sum_values.add(value_sum);
            }

        }

        System.out.println("Maximum extraction : "+Collections.max(sum_values));
        // 3. find a maximum value

        // int weights1[] = subset(weights, 0, 1);

    }

    public static void main(String[] args) {
        int weights[] = { 10, 20, 30 };
        int values[] = { 60, 100, 120 };
        int bag = 50;

        long startTime = System.nanoTime();
        knapsack01(weights, values, bag);
        long endTime = System.nanoTime();

        long milisecond = (endTime - startTime)/1000000;
        long microsecond = (endTime - startTime)/10000;
        long nanosecond = (endTime - startTime)/1000;
        System.out.println("Total time : "+milisecond+" milisecond");
        System.out.println("Total time : "+microsecond+" microsecond");
        System.out.println("Total time : "+nanosecond+" nanosecond");
    }
}