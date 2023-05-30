package chapter_2;
/*demonstrate the use of the conditional operator if
name the original file "IfSample.java"*/
public class IfSample {
    public static void main(String [] args){
int x, y;
    x = 10;
    y = 20;
    if (x < y)
      System.out.println("x less than y");
      x = x * 2;
      if (x == y)
         System.out.println("x equal y now");
         x = x * 2;
         if (x > y)
         System.out.println("x more than y now");
            // this statement will not output anything
            if (x == y)
            System.out.println("you won't see anything");
    }
}
