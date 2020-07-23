public class Print12N {

    public static void print12N(int a[], int i) {
        if(a.length+1 == i){
            System.out.println("end");
        }else{
            System.out.println(i);
            print12N(a, i+1);
        }
    }
    public static void main(String[] args) {

        // int input[] = {4,3,2,1};
        int input[] = new int[13];
        for (int i = 0; i < input.length; i++) {
            input[i] = input.length-i;
        }

        // System.out.println(Arrays.toString(input));
        long startTime = System.nanoTime();
        print12N(input, 1);
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