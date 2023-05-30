package chapter_8;
// Demonstrate the order in which are called  constructors
//  create a superclass
 class A {
     A(){
         System.out.println(" in constructor A.");
     }
}
// create a subclass by extending class A
class B extends A {
     B(){
         System.out.println(" in constructor B.");
     }
}
// create another subclass by extending class B
class  C extends B {
    C() {
        System.out.println(" in constructor C.");
    }
}
class CollingCons{
     public static void main(String []args){
         C c = new C();
     }
}
