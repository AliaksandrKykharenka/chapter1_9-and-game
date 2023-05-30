package chapter_5;
//The target part of the loop can be empty
public class NoBody {
    public static void main(String[] args) {
        int i, j;
        i = 100;
        j = 200;
        // calculate the average of the variables
        while (++i < --j); // this cycle has no body
        System.out.println(" the average is " + i);
    }
}
