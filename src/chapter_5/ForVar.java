package chapter_5;
// Separate parts of the for loop statement may be empty
public class ForVar {
    public static void main(String[] args) {
        int i;
        boolean done = false;
        i = 0;
        for (; !done; ) {
            System.out.println(" i equals " + i);
            if (i == 10) done = true;
            i++;
        }
    }
}
