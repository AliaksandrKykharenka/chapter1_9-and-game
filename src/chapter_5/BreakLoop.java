package chapter_5;
// applying a break operator to  escape a cycle
public class BreakLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i == 10) break; // exit the loop, if variable i is equal to 10
            System.out.println(" i : " + i);
        }
            System.out.println("the loop has done . ");
        }
    }
