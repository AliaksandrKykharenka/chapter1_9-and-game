package chapter_5;
// demonstrate the applying the do-while operate cycle
public class DoWhile {
    public static void main(String[] args) {
        int n,t;
         t = 10;
         n = 10;
        do {
            System.out.println(" tact " + n);
            n--;
        }while (n>-0);
        System.out.println("the same cycle only modified a little bit");
        do {
            System.out.println("tact " + t);
        }while (--t > 0);
    }
}
