
public class Knapsack01 {

    public static int[] subset(int weights[], int u, int v) {

        return new int[]{1,2,3};
    }
    

    public static void knapsack01(int weights[], int values[], int bag) {

        // 1. find all the subset
        // 2. test with all subset and build an array 
        // 3. find a maximum value

        // int weights1[] = subset(weights, 0, 1);
        
    }

    public static void main(String[] args) {
        int weights[] = {10,20,30};
        int values[] = {60,100,120};
        int bag = 50;


        knapsack01(weights, values, bag);
    }
}