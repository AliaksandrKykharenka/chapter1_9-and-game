package chapter_4;
//  shift to the left the meaning byte
public class ByteShift {
    public static void main(String[] args) {
         byte a = 64, b;
         int i;
         i = a << 2;
         b = (byte) (a <<2);

         System.out.println(" The initial value а: " + a);
         System.out.println("i and Ь: " + i + " " + b);
    }
}
