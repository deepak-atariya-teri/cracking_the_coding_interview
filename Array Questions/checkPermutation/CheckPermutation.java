import java.util.ArrayList;
import java.util.Arrays;

/*
BCR - o(N)
Actual - o(N)
where is n is the size of the input screen 
*/


public class CheckPermutation {
    public static ArrayList<String> allpermutation = new ArrayList<String>();
    public static void main(String...s) {
        String case1 = "ABC";
        String match = "BCA";
        // check()
        permutation(case1, 0, case1.length()-1);
        // System.out.println(allpermutation);
        if(allpermutation.contains(match)){
            System.out.println("it is a permutation");
        }else{
            System.out.println("Not a permutation");
        }
    }

    public static void permutation(String str, int l , int r) {
        if (l==r){
            allpermutation.add(str);
            // System.out.println(str);
        }else{
            for (int i=l; i<=r; i++){
                str = swap(str, l, i);
                permutation(str, l+1, r);
                // str = swap(str, l, i);
            }
        }
    }

    public static String swap(String str, int l, int r) {
        char strChar[] = str.toCharArray();
        char temp = strChar[l];
        strChar[l] = strChar[r];
        strChar[r] = temp;

        return new String(strChar);
    }

    // public static String print(Object obj){
    //     return obj.toString();
    // }

    
}