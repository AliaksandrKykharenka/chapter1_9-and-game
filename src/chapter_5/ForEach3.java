package chapter_5;
//Applying a for loop in for-each style
// to accessing a two-dimensional array
public class ForEach3 {
    public static void main(String[] args) {
    int sum = 0;
    int nums [][] = new int[3][5];
// assign a value to the elements of the nums array
for ( int i = 0 ; i < 3 ; i++ )
            for ( int j = 0 ; j < 5 ; j ++ )
    nums[i][j] = (i + 1) * (j + 1);
// using a for loop in a for-each style for
// output and summing meanings
for ( int х [] : nums ) {
    for (int у : х) {
        System.out.println(" meaning is : " + у);
        sum += у;
    }
}
        System.out.println(" sum : " + sum);
    }
}