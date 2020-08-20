import java.util.Arrays;

class Knapsack01 {
    
    public static void topdown(int weights[], int values[], int w, int n) {
        // initialisation as base statement
        int[][] m = new int[n+1][w+1];
        
        // choice diagram
        for (int i = 1; i < m.length; i++) {
            for (int j = 1; j < m[i].length; j++) {
                if (weights[i-1]<=j) {
                    int cons = values[i-1]+m[i-1][j-weights[i-1]];
                    int nc = m[i-1][j-1];
                    m[i][j] = cons > nc ? cons : nc;
                }else{
                    int nc = m[i-1][j-1];
                    m[i][j] = nc;
                }
            }
        }

        for (int i = 0; i < m.length; i++) {
            System.out.println(Arrays.toString(m[i]));
        }
        // System.out.println(m[n][w]);
        
    }


    public static int knapsack01(int weights[], int values[], int bag, int n, int m[][]) {
        // System.out.println(n + "response ");
        if (bag == 0 || n == 0) {
            return 0;
        }
        if(m[n][bag]!=0){
            return m[n][bag];
        }
        if (weights[n - 1] <= bag) {
            int consider = values[n - 1] + knapsack01(weights, values, bag - weights[n - 1], n - 1, m);
            int nc = knapsack01(weights, values, bag, n - 1, m);
            m[n][bag] = consider > nc ? consider : nc;
            return m[n][bag];
        } else if (weights[n - 1] > bag) {
            int nc = knapsack01(weights, values, bag, n - 1, m);
            return nc;
        }
        return 0;
    }

    public static void main(String[] args) {
        int weights[] = { 1, 2, 3 };
        int values[] = { 60, 100, 120 };
        int bag = 5;

        long startTime = System.nanoTime();
        // System.out.println(knapsack01(weights, values, bag, weights.length, new int[weights.length+1][bag+1]));
        topdown(weights, values, bag, weights.length);
        long endTime = System.nanoTime();

        long milisecond = (endTime - startTime) / 1000000;
        long microsecond = (endTime - startTime) / 10000;
        long nanosecond = (endTime - startTime) / 1000;
        System.out.println("Total time : " + milisecond + " milisecond");
        System.out.println("Total time : " + microsecond + " microsecond");
        System.out.println("Total time : " + nanosecond + " nanosecond");
    }
}