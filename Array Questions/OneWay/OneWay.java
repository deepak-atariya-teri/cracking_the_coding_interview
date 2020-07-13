/*
There are three types of edits that can be performed on strings: 
insert a character,
remove a character, or 
replace a character. 
Given two strings, write a function to check if they are one edit (or zero edits) away.

EXAMPLE
pale, ple -> true
pales. pale -> true
pale. bale -> true
pale. bake -> false

*/

public class OneWay{
    public static Boolean isInserted(String changed, String primary) {
        if(changed.length() == primary.length()+1){
            return true;
        }else{
            return false;
        }
    }
    public static Boolean isDeleted(String changed, String primary) {
        if(changed.length() == primary.length()-1){
            return true;
        }else{
            return false;
        }
    }

    public static Boolean isReplaced(String changed, String primary) {
        if(changed.length() == primary.length()){
            int changes_count = isequal(changed, primary);
            if(changes_count==1){
                return true;
            }else{
                return false;
            }
            // return !isequal(changed, primary);
        }else{
            return false;
        }
    }

    public static int isequal(String changed, String primary) {
        int count_changes = 0; 
        for(int i=0; i<changed.length(); i++){
            if(primary.charAt(i)!=changed.charAt(i)){
                count_changes++;
            }
        }
        return count_changes;
    }

    public static void main(String[] args) {
        // String changed[] = {"pale", "pales", "pale", "pale"};
        // String primary[] = {"ple", "pale", "bale", "bake"};
        String changed[] = {"abc", "pales", "pale", "pale"};
        String primary[] = {"abcd", "pale", "bale", "bake"};

        for (int i=0; i<changed.length; i++){
            if (isInserted(changed[i], primary[i]) || isDeleted(changed[i], primary[i]) || isReplaced(changed[i], primary[i])){
                System.out.println(changed[i]+", "+primary[i]+"-> true");
            }else{
                System.out.println(changed[i]+", "+primary[i]+"-> false");
            }
        }
    }
}