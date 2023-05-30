package chapter_4;
// demonstrate the applying ternary operation
public class Ternary {
    public static void main(String[] args) {
int i, k;
i = 10;
k = i < 0 ? -i : i;   // get the absolut value of a variable i
        System.out.print(" Absolut value ");
        System.out.println(i + " equels " + k);
        i = -10;
        k = i < 0 ? -i : i; //  get the absolut value of variable i

        System.out.print(" Absolut value ");
        System.out.println(i + " equels " + k);
    }
}
