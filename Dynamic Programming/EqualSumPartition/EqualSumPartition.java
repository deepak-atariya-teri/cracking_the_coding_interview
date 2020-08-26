import java.util.Arrays;

public class EqualSumPartition {

    public static Boolean equalSumPartition(int items[]) {
        int items_sum = 0;
        for (int i = 0; i < items.length; i++) {
            items_sum+=items[i];
        }
        if(items_sum%2!=0){
            return false;
        }else if(items_sum%2==0){
            int sum = items_sum/2;
            System.out.println(sum);
            int n = items.length;
            Boolean m[][] = new Boolean[n+1][sum+1];
            for (Boolean[] booleans : m) {
                Arrays.fill(booleans, false);
            }
            return subSetSum(items, sum, n, m);
        }else{
            return false;
        }
    }

    public static Boolean subSetSum(int items[], int sum, int n, Boolean m[][]) {   
        if(n==0){
            return false;
        }
        if(sum == 0){
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
        int items[] = { 0,0,0,0,0 };
    
        long startTime = System.nanoTime();
        System.out.println(equalSumPartition(items));
        long endTime = System.nanoTime();
    
        long milisecond = (endTime - startTime) / 1000000;
        long microsecond = (endTime - startTime) / 10000;
        long nanosecond = (endTime - startTime) / 1000;
        System.out.println("Total time : " + milisecond + " milisecond");
        System.out.println("Total time : " + microsecond + " microsecond");
        System.out.println("Total time : " + nanosecond + " nanosecond");
    }
}
