package chapter_5;
// aplying the for loop in the  style of for each
public class ForEach2 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        // using for loop in the for-each style for
        //  output and summation of values from a part of the array
        for (int x : nums) {
            System.out.println(" meaning is : " + x);
            sum += x;
            if (x == 5) break; // interrupt the loop after
            // getting 5 meanings
        }
            System.out.println(" The sum of the first five elements is    : " + sum);
    }
}
