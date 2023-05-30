package chapter_5;
// search in an array applying a for loop in a for-each style
public class Search {
    public static void main(String[] args) {
        int nums [] = {6,8,3,7,5,6,1,4};
        int val = 5;
        boolean found = false;
        //  use a for loop in a for-each style for
        // searching  a variable meaning val in the array nums
        for ( int x : nums) {
            if (x == val) {
                found = true;
                break;
            }
        }
                if(found)
                        System.out.println ( " meaning has found ! " );
    }
}
