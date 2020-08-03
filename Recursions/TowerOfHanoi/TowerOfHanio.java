public class TowerOfHanio {
    
    public static void toh(int n, char source, char target, char temp) {
        if(n==1){
            System.out.println("1 - "+source+" to "+target);
        }else{
            toh(n-1, source, temp, target);
            System.out.println(n+" - "+source+" to "+target);
            toh(n-1, temp, target, source);
        }
        
    }

    public static void main(String[] args) {
        long startTime = System.nanoTime();
        int disk = 3;
        toh(disk, 'A','C','B'); 
        long endTime = System.nanoTime();

        long milisecond = (endTime - startTime) / 1000000;
        long microsecond = (endTime - startTime) / 10000;
        long nanosecond = (endTime - startTime) / 1000;
        System.out.println("Total time : " + milisecond + " milisecond");
        System.out.println("Total time : " + microsecond + " microsecond");
        System.out.println("Total time : " + nanosecond + " nanosecond");
    }

}