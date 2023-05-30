package chapter_7;
// A simple recursion example
public class Factorial {
    // this is a recursive method
        int fact ( int n){
            int result;
            if (n == 1) return 1;
            result = fact(n - 1) * n;
            return result;
        }
    }
    class  Recursion{
    public static void main(String[] args) {
                Factorial f = new Factorial ();
                        System.out.println(" Factorial 3 equals " + f.fact (3));
                        System.out.println(" Factorial 4 equals " + f.fact (4));
                        System.out.println(" Factorial 5 equals " + f.fact (5));
    }
}
