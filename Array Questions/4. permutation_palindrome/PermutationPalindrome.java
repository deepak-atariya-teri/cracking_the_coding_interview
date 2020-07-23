/*
Question : 
Palindrome Permutation: Given a string, write a function to check if it is a permutation of a palindrome. 
A palindrome is a word or phrase that is the same forwards and backwards. A permutation
is a rearrangement of letters. The palindrome does not need to be limited to just dictionary words.
EXAMPLE
Input: Tact Coa
Output: True (permutations: "taco cat". "atco cta". etc.) 



Time complexity analysis

we have four functions 
1. permutation - O(n*n!) because recursion function under the o(n) loop and permutation gives its factorial times strings
2. swap - O(1) it is a constant operation
3. checkpalindrom - O(N) because we have iterate the string in the reverse order to check whether palindrome or not
4. remove space - O(N) because we are iterating through each value to check whether space or not and 

Important point : we are terminating the program whenver we find the palindrome (it is helpful to save the time)

According to the point above we can consider the best case time complexity when we are getting a palindrome string from the permutations,
~permutation calls the checkPalindrome function so it multiplies the time complexity

BCR - O(N!) * O(N)
Best Case  - O(N!) + O(1) * O(N) + O(1) = O(N! * N)
Worst Case  - O(N!) + O(1) * O(N) + O(N) = O(N! * N)
if N = 5 then operations are 120*5 = 600
 
** Permutation time complexity dominates others, therefore we have highest/greatest time complexity is O(N!)
*/

import java.util.ArrayList;
import java.util.Arrays;

public class PermutationPalindrome {
    public static ArrayList<String> allpermutation = new ArrayList<String>();
    public static void main(String...s) {
        // String case1 = "tact coa";
        String case1 = "nurses run";
        // check()
        // System.out.println(checkPalindrome(case1));
        permutation(case1, 0, case1.length()-1);

        int total = 0;
        for (int i = 0; i < allpermutation.size(); i++) {
            if(checkPalindrome(allpermutation.get(i))){
                total++;
                String str = allpermutation.get(i);
                System.out.println("Found the palindrome from the permutation -- "+str);
            }
        }
        System.out.println(total);

        System.out.println(allpermutation.size());
    }

    public static void permutation(String str, int l , int r) {
        // System.out.println("("+l+", "+r+")");
        if (l==r){
            // System.out.println("processing");
            allpermutation.add(str);
            // if(checkPalindrome(str)){
            //     System.out.println("Found the palindrome from the permutation -- "+str);
            //     System.exit(0);
            // }
            // System.out.println(str);
        }else{
            for (int i=l; i<=r; i++){
                
                str = swap(str, l, i);
                permutation(str, l+1, r);
                str = swap(str, l, i);
            }
        }
        // count++;
    }


    

    public static String swap(String str, int l, int r) {
        char strChar[] = str.toCharArray();
        char temp = strChar[l];
        strChar[l] = strChar[r];
        strChar[r] = temp;

        return new String(strChar);
    }

    public static Boolean checkPalindrome(String str) {
        String reverse = "";

        // remove whitespaces
        str = removeSpaces(str);

        for(int i=str.length()-1; i>=0; i--){
            reverse = reverse + str.charAt(i);
        }
        // System.out.println(reverse);
        if(reverse.equals(str)){
            return true;
        }
        return false;
    }

    public static String removeSpaces(String str){
        
        String strWithoutSpaces = ""; 

        // inplace solution to remove spaces
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)!=' '){
                 strWithoutSpaces+=str.charAt(i);
            }
        }

        return strWithoutSpaces;
    }

}