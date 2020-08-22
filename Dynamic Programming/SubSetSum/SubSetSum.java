import java.util.Arrays;

public class SubSetSum {

    public static Boolean topDown(int items[], int sum, int n, Boolean m[][]) {
        return true;
    }   
    

    public static Boolean subSetSum(int items[], int sum, int n, Boolean m[][]) {   
        if(n==0){
            return false;
        }
        if(sum == 0){
            for (Boolean[] booleans : m) {
                System.out.println(Arrays.toString(booleans));
            }
            System.out.println("----------- Call Separation --------------");
            return true;
        }

        if(m[n][sum]){
            return m[n][sum];
        }

        if(items[n-1]<=sum){
            return m[n][sum] = subSetSum(items, sum-items[n-1], n-1, m) || subSetSum(items, sum, n-1, m);
        }

        if(items[n-1]>sum){
            return subSetSum(items, sum, n-1, m);
        }

        return false;

    }
    

    public static void main(String[] args) {
        int items[] = { 1, 2, 3 };
        int sum = 5;
        int n = items.length;
        Boolean m[][] = new Boolean[n+1][sum+1];
        for (Boolean[] booleans : m) {
            Arrays.fill(booleans, false);
            // System.out.println(Arrays.toString(booleans));
        }

    
        long startTime = System.nanoTime();
        // System.out.println(knapsack01(weights, values, bag, weights.length, new int[weights.length+1][bag+1]));
        System.out.println(subSetSum(items, sum, n, m));
        long endTime = System.nanoTime();
    
        long milisecond = (endTime - startTime) / 1000000;
        long microsecond = (endTime - startTime) / 10000;
        long nanosecond = (endTime - startTime) / 1000;
        System.out.println("Total time : " + milisecond + " milisecond");
        System.out.println("Total time : " + microsecond + " microsecond");
        System.out.println("Total time : " + nanosecond + " nanosecond");
    }
}
