import java.util.Arrays;
import java.util.Stack;

public class StackSort {

    public static void sortStack(Stack stack) {
        for (int i = 0; i < stack.size()-1; i++) {
            for (int j = stack.size()-1; j > 1; j--) {
                int num1 = (int)stack.get(j);
                int num2 = (int)stack.get(j-1);
                if (num1 > num2) {
                    int times = (stack.size() - j - 1 ) + 2;
                    int temp[] = new int[times];
                    // poping 
                    for (int k = 0; k <times ; k++) {
                        temp[k] = (int)stack.pop();
                    }
                    if(temp.length>2){
                        int ln = temp.length;
                        int tmp = temp[temp.length-1];
                        temp[temp.length-1] = temp[temp.length-1]; 
                        temp[temp.length-2] = tmp; 
                    }
                    
                    // pushing
                    for (int k = times-1; k >=0 ; k--) {
                        stack.push(temp[k]);
                    }
                    System.out.println(Arrays.toString(temp));     
                }
            }
            
            // System.out.println("output "+stack);
        }

    }



    public static void main(String[] args) {

        Stack stack = new Stack<Integer>();
        stack.add(1);
        stack.add(2);
        stack.add(3);
        stack.add(4);
        // System.out.println(stack.get(0));
        System.out.println("input "+stack);

        long startTime = System.nanoTime();
        sortStack(stack);
        long endTime = System.nanoTime();

        long milisecond = (endTime - startTime) / 1000000;
        long microsecond = (endTime - startTime) / 10000;
        long nanosecond = (endTime - startTime) / 1000;
        System.out.println("Total time : " + milisecond + " milisecond");
        System.out.println("Total time : " + microsecond + " microsecond");
        System.out.println("Total time : " + nanosecond + " nanosecond");

    }
    
}