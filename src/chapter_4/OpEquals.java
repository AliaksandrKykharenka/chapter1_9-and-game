package chapter_4;
// demonstrate the use of multiple assignment operations
public class OpEquals {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        a += 5;
        b *= 4;
        c += a * b;
        System.out.println(c);
        c %= 6;
        System.out.println(c + " That" );
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}
