import java.util.Arrays;

/*
BCR - o(N)
Actual - o(N)
where is n is the size of the input screen 
*/


public class IsUnique {
    public static void main(String...s) {
        String case1 = "32023597546350293186566188544305601900743327603652554574600002631";
        if(test(case1)){
            System.out.println("Unique");
        }else{
            System.out.println("Not Unique");
        }
    }

    public static Boolean test(String s) {
        int a_z[] = new int[256];

        // increase by 1 on each character occurance
        for (int i = 0; i < s.length(); i++){
            a_z[(int) s.charAt(i)]++;
        }
        // System.out.println(Arrays.toString(a_z));

        // find the sum
        int count = 0;
        for (int i = 0; i < a_z.length; i++){
            if(a_z[i]>0){
                count++;
            }
        }

        // System.out.println(count);

        return count == s.length();

    }

    // public static String print(Object obj){
    //     return obj.toString();
    // }

    
}