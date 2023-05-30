package chapter_3;
// Demonstrating variable validity period
public class LifeTime {
    public static void main(String[] args) {
        int x;
        for(x = 0; x < 3; x++){
            int y = -1; // variable y is initialized
                        //  when each occurrence in a block of code
        System.out.println(" y is : " + y); //here always output -1
        y = 100;
        System.out.println("y now is :" + y );
        }

    }
}
