package chapter_3;
//demonstrate the applying of type values boolean
public class BoolTest {
    public static void main(String[] args) {
boolean b;
b = false;
System.out.println("b equals " + b);
b = true;
System.out.println("b equals " + b);
// The meaning of type boolean can operate an operator if.
 if (b)
 System.out.println("This code is executed.");
        b = false;
        if (b)
        System.out.println("This code is not executed.");
        // the result of the comparison - a value of type boolean

        System.out.println("10 > 9 equals " + (10 > 9));
    }
}
