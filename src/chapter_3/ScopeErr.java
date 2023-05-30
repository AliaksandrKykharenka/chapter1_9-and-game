package chapter_3;

public class ScopeErr {
    public static void main(String[] args) {
        int bar = 1;
        { //int bar =1; //a new scope is created
                       // error during compilation -
                       // the variable bar is already defined !
        }
        }
    }

