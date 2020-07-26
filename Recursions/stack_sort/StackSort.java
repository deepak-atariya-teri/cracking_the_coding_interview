import java.util.Arrays;
import java.util.Stack;

public class StackSort {



    public static Stack<Integer> insert(Stack a, int temp) {
        
        if(a.size()==0 || (int)a.peek() <=temp){
            a.push(temp);
            return a;
        }
        
        
        int val = (int)a.peek();
        a.pop();
        insert(a, temp);
        a.push(val);

        System.out.println(a);
        return a;
    }

    public static Stack<Integer> sortArrayYash(Stack a) {

        if(a.size() == 1){
            return a;
        }
        int temp = (int)a.peek();
        // System.out.println(temp);
        a.pop();
        System.out.println("Array is   "+a+" temp is "+temp);
        sortArrayYash(a);
        return insert(a, temp);
    }

    public static void main(String[] args) {

        Stack stack = new Stack<Integer>();
        stack.add(4);
        stack.add(3);
        stack.add(2);
        stack.add(1);
        // System.out.println(stack.get(0));
        System.out.println("input "+stack);

        long startTime = System.nanoTime();
        System.out.println(sortArrayYash(stack));
        long endTime = System.nanoTime();

        long milisecond = (endTime - startTime) / 1000000;
        long microsecond = (endTime - startTime) / 10000;
        long nanosecond = (endTime - startTime) / 1000;
        System.out.println("Total time : " + milisecond + " milisecond");
        System.out.println("Total time : " + microsecond + " microsecond");
        System.out.println("Total time : " + nanosecond + " nanosecond");

    }
    
}