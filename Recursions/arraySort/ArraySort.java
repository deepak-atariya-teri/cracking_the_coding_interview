import java.util.ArrayList;
import java.util.Arrays;

public class ArraySort {

    // arraySortV2 faster than sortArrayV1 but I do not recommend this method of exvessive recursive call that can take more time when array length is greater
    // for 13 element of array it is taking 40 secs which is not efficient, in this case arraySortV1 is better.

    // QUICK TIP : Do not go for 2 level recursion or nested recursion, it drains

    public static ArrayList<Integer> insert(ArrayList a, int temp) {
        
        if(a.size()==0 || (int)a.get(a.size()-1)<=temp){
            a.add(temp);
            return a;
        }
        
        int val = (int)a.get(a.size()-1);
        a.remove(a.size()-1);
        insert(a, temp);
        a.add(val);

        // System.out.println(a);
        return a;
    }

    public static ArrayList<Integer> sortArrayYash(ArrayList a) {

        if(a.size() == 1){
            return a;
        }
        int temp = (int)a.get(a.size()-1);
        // System.out.println(temp);
        a.remove(a.size()-1);
        // System.out.println("Array is   "+a+" temp is "+temp);
        sortArrayYash(a);
        return insert(a, temp);

    }

    public static int[] sortArrayV1(int a[], int i) {

        /*
         * [2, 5, 10, 30, 400] 
         * Total time : 1 milisecond 
         * Total time : 161 microsecond
         * Total time : 1618 nanosecond
         * 
         * [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13]
         * Total time : 1 milisecond
         * Total time : 162 microsecond
         * Total time : 1620 nanosecond
         */

        if (a.length - 1 == i) {
            return a;
        } else {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    a[j] = a[j] ^ a[j + 1];
                    a[j + 1] = a[j] ^ a[j + 1];
                    a[j] = a[j] ^ a[j + 1];
                }
            }
            return sortArrayV1(a, (i + 1));
        }
    }

    public static int[] sortArrayV2(int a[], int i, int j) {

        
        /*
         * [2, 5, 10, 30, 400] 
         * Total time : 1 milisecond 
         * Total time : 147 microsecond
         * Total time : 1474 nanosecond
         * 
         * [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13]
         * Total time : 40084 milisecond
         * Total time : 4008450 microsecond
         * Total time : 40084503 nanosecond
         */

        if (a.length - 1 == i) {
            return a;
        } else {
            if (j < a.length - i - 1) {
                if (a[j] > a[j + 1]) {
                    a[j] = a[j] ^ a[j + 1];
                    a[j + 1] = a[j] ^ a[j + 1];
                    a[j] = a[j] ^ a[j + 1];
                }
                sortArrayV2(a, i, (j + 1));
            }
            return sortArrayV2(a, (i + 1), 0);
        }
    }

    public static void main(String[] args) {

        // int input[] = {4,3,2,1};
        int input[] = new int[13];
        for (int i = 0; i < input.length; i++) {
            input[i] = input.length-i;
        }

        ArrayList inpt = new ArrayList<Integer>();
        inpt.add(4000000);
        inpt.add(30000);
        inpt.add(200);
        inpt.add(1000);

        System.out.println("Input - "+inpt);

        
        // System.out.println(Arrays.toString(input));
        long startTime = System.nanoTime();
        System.out.println("Output - "+sortArrayYash(inpt));
        // System.out.println(Arrays.toString(sortArrayV1(input, 0)));
        // System.out.println(Arrays.toString(sortArrayV2(input, 0, 0)));
        long endTime = System.nanoTime();

        long milisecond = (endTime - startTime) / 1000000;
        long microsecond = (endTime - startTime) / 10000;
        long nanosecond = (endTime - startTime) / 1000;
        System.out.println("Total time : " + milisecond + " milisecond");
        System.out.println("Total time : " + microsecond + " microsecond");
        System.out.println("Total time : " + nanosecond + " nanosecond");

    }

}