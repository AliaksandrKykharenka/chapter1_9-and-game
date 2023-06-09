package chapter_8;
// Apply polymorphism at runtime
 class Figure {
double dim1;
double dim2;
Figure(double a, double b){
    dim1 = a;
    dim2 = b;
}
double area(){
    System.out.println(" The area of the figure is not defined ");
    return 0;
}
}
class Rectangle extends Figure{
     Rectangle(double a, double b){
         super(a, b);
     }
     // override the area() method for the quad
     double area(){
         System.out.println(" in the area of the quadrilateral ");
         return dim1 * dim2;
     }
}
class Triangle extends Figure{
     Triangle(double a, double b){
         super(a, b);
     }
     // override area() method for right triangle
    double area(){
         System.out.println(" in the area of the triangle");
         return dim1 * dim2/2;
    }
}
class FindArea {
    public static void main(String args[]) {
        Figure f = new Figure(10, 10);
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);
        Figure figref;
        figref = r;
        System.out.println(" The area is " + figref.area());
        figref = t;
        System.out.println(" The area is " + figref.area());
        figref = f;
        System.out.println(" The area is " + figref.area());
    }
}
