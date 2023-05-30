package chapter_6;
 class Box {
    double width;
     double height;
     double depth;

     // output the volume of parallelepiped
     double volume (){
         return width * height * depth;
     }
}
class BoxDemo4{
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol1;
        double vol2;

        //  assign value to mybox1 instance variables
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;
        //  assign value to mybox2 instance variables
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;
vol1 = mybox1.volume();
        System.out.println( vol1);
vol2 = mybox2.volume();
System.out.println( vol2);
        System.out.println(mybox1.volume() );
        System.out.println(mybox2.volume() );
    }
}
