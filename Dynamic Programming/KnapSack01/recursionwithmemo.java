import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.IntStream;

class Knapsack01 {
	
    public static int knapsack01(int weights[], int values[], int bag, int n) {
    	System.out.println(n + "response ");
    	if(bag==0 || n==0){
    	return 0;
    	}
    if(weights[n-1]<=bag){
    	int consider = values[n-1] + knapsack01(weights, values, bag-weights[n-1], n-1) ;
    int nc = knapsack01(weights, values, bag, n-1) ;
    	return consider>nc?consider:nc;
}else if(weights[n-1]>bag){
    int nc = knapsack01(weights, values, bag, n-1) ;
    	return nc;
    }
    return 0;
    }

    public static void main(String[] args) {
        int weights[] = { 10, 20, 30 };
        int values[] = { 60, 100, 120 };
        int bag = 50;

        long startTime = System.nanoTime();
        System.out.println(knapsack01(weights, values, bag, weights.length));
        long endTime = System.nanoTime();

        long milisecond = (endTime - startTime)/1000000;
        long microsecond = (endTime - startTime)/10000;
        long nanosecond = (endTime - startTime)/1000;
        System.out.println("Total time : "+milisecond+" milisecond");
        System.out.println("Total time : "+microsecond+" microsecond");
        System.out.println("Total time : "+nanosecond+" nanosecond");
    }
}