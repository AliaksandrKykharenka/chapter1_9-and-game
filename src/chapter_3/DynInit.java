package chapter_3;
//this example demonstrates dynamic initialization
public class DynInit {
    public static void main(String[] args) {
double a = 3.0, b = 4.0;
// dynamic initialization of variable c
        double c = Math.sqrt(a * a + b * b);
        System.out.println("the hypotenuse is " + c);
    }
}