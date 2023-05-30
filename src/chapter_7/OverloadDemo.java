package chapter_7;
// demonstrate overload method
     class OverloadDemo {
    void test() {
        System.out.println("parameters missing ");
    }

    // Overloaded method that checks for presence
    //one integer parameter
    void test(int a) {
        System.out.println(" a : " + a);
    }

    // Overloaded method that checks for presence
    //two integer parameters
    void test(int a, int b) {
        System.out.println(" a and b : " + a + " " + b);
    }

    // Overloaded method that checks for presence
    // a double type parameter
    double test(double a) {
        System.out.println(" double а : " + a);
        return a * a;
    }
}
          class Overload {
              public static void main(String[] args) {
                  OverloadDemo ob = new OverloadDemo();
                  double result;
                  // вызвать все варианты метода test ()
                  ob.test();
                  ob.test(10);
                  ob.test(10, 20);
                  result = ob.test(123.25);
                  System.out.println(" call result of ob.test(123.25) : " + result);
              }
          }

