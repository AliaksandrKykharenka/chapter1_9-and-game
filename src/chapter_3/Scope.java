package chapter_3;
// demonstrate code block scope
public class Scope {
    public static void main(String[] args) {
        int x; // this variable is available to all code from the method main()
        x = 10;
        if (x == 10) { //the start of a new scope,
         int y =20;//available only to this block of code
        // both variables x and y are available in this scope
        }
        // y = 100; // ERRO ! the variable y is not available
                 // in this scope
                 // but the variable x is available here
   System.out.println("x is  "  + x);
    }
}
