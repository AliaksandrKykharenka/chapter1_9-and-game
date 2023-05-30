package chapter_2;
/*demonstrate the application of the  block of code
* name the original file "BlockTest.java"*/
public class BlockTest {
    public static void main(String[] args) {
        int x, y;
        y = 20;
// the destination of this loop statement is the block of code
        for (x = 0; x < 10; x++){
            System.out.println("The meaning x: " + x);
            System.out.println("The meaning y: " + y);
            y = y - 2;
    }
}
}